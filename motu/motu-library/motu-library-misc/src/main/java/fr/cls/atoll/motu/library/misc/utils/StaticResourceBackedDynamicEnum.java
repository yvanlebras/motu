/*
 * @(#)StaticResourceBackedDynamicEnum.java     9 Feb 2009
 * 
 * Copyright � 2009 Andrew Phillips.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 * THIS FILE HAS BEEN MODIFIED BY CLS
 */

package fr.cls.atoll.motu.library.misc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * An abstract {@link DynamicEnum} implementation that loads the enum constants
 * from a repository at initialization. After this one-off load, the enumeration
 * is fixed.
 * <p>
 * The ordering of the enumeration is determined by the order returned by the
 * repository.
 * <p>
 * If the repository returns two or more equal enum values, initialization will
 * fail.
 * 
 * @param <E> the type of the enum values
 * @param <D> the type of the objects giving rise to the enum values
 * 
 * @author anphilli
 * @since 5 Feb 2009
 */
public class StaticResourceBackedDynamicEnum<E, D extends DynamicEnumerable<E>>
        implements DynamicEnum<E, D> {
    /*
     * Not a particularly efficient implementation in terms of size - lots of
     * duplication here. Other data structures (e.g. SortedMaps) might prove
     * useful.
     */
    /** The ordered dynamic enum values. */
    private final List<E> orderedDynamicEnumValues;
    
    /** The dynamic enum values. */
    private final Map<E, DynamicEnumValueDescriptor> dynamicEnumValues;
    
    /** The dynamic enum value names. */
    private final Map<String, E> dynamicEnumValueNames;

    /**
     * Maintains information about the loaded enum constants for convenient
     * retrieval.
     * 
     * @author anphilli
     * @since 5 Feb 2009
     */
    private final class DynamicEnumValueDescriptor {
        
        /** The ordinal. */
        private int ordinal;
        
        /** The backing object. */
        private D backingObject;

        /**
         * Instantiates a new dynamic enum value descriptor.
         * 
         * @param ordinal the ordinal
         * @param backingObject the backing object
         */
        private DynamicEnumValueDescriptor(int ordinal, D backingObject) {
            this.ordinal = ordinal;
            this.backingObject = backingObject;
        }

    }

    /**
     * Creates a <code>StaticResourceBackedDynamicEnum</code>, passing all
     * dependencies.
     * <p>
     * Initializes the enumeration immediately.
     * <p>
     * <b>NB:</b> Not thread safe! In other words, the constructor should not be
     * called from multiple threads concurrently.
     * 
     * @param dynamicEnumerables the dynamic enumerables
     */
    public StaticResourceBackedDynamicEnum(
            List<D> dynamicEnumerables) {

        int numDynamicEnumerables = dynamicEnumerables.size();
        orderedDynamicEnumValues = new ArrayList<E>(numDynamicEnumerables);
        dynamicEnumValues = new HashMap<E, DynamicEnumValueDescriptor>(numDynamicEnumerables);
        dynamicEnumValueNames = new HashMap<String, E>(numDynamicEnumerables);

        for (int i = 0; i < numDynamicEnumerables; i++) {
            D dynamicEnumerable = dynamicEnumerables.get(i);
            E dynamicEnumValue = dynamicEnumerable.enumValue();

            // no two enum values should be the same!
            if (dynamicEnumValues.containsKey(dynamicEnumValue)) {
                throw new AssertionError("Invalid enumerables - duplicate enum value "
                                         + dynamicEnumValue + " generated by item "
                                         + dynamicEnumerable);
            }

            // will (obviously) go into position i
            orderedDynamicEnumValues.add(dynamicEnumValue);
            dynamicEnumValues.put(dynamicEnumValue, 
                    new DynamicEnumValueDescriptor(i, dynamicEnumerable));
            dynamicEnumValueNames.put(dynamicEnumerable.name(), dynamicEnumValue);
        }

    }

    /** {@inheritDoc} */
    public boolean exists(E enumValue) {
        return dynamicEnumValues.containsKey(enumValue);
    }

    /** {@inheritDoc} */
    public E valueOf(String name) {
        checkValidKey(dynamicEnumValueNames, name, "'name' may not be null",
                      "dynamic enum constant name");
        return dynamicEnumValueNames.get(name);
    }

    /**
     * Check valid key.
     * 
     * @param map the map
     * @param key the key
     * @param nullKeyMessage the null key message
     * @param mapKeyTypeDescription the map key type description
     */
    private static <K> void checkValidKey(Map<K, ?> map, K key,
            String nullKeyMessage, String mapKeyTypeDescription) {

        if (key == null) {
            throw new NullPointerException(nullKeyMessage);
        } else if (!map.containsKey(key)) {
            throw new IllegalArgumentException("'" + key + "' is not a valid "
                                               + mapKeyTypeDescription);
        }

    }

    /** {@inheritDoc} */
    public List<E> values() {
        return new ArrayList<E>(orderedDynamicEnumValues);
    }

    /** {@inheritDoc} */
    public int ordinal(E enumValue) {
        checkValidKey(dynamicEnumValues, enumValue, "'enumValue' may not be null", 
                      "dynamic enum constant");
        return dynamicEnumValues.get(enumValue).ordinal;
    }

    /** {@inheritDoc} */
    public int compare(E enumValue1, E enumValue2) {
        
        if ((enumValue1 == null) || (enumValue2 == null)) {
            throw new NullPointerException("Input values may not be null");
        } else if (!exists(enumValue1) || !exists(enumValue2)) {
            throw new ClassCastException("'" + enumValue1 + "' or '" + enumValue2 
                                         + "' is not a valid dynamic enum constant" );
        }
        
        return (ordinal(enumValue1) - ordinal(enumValue2));
    }
    
    /** {@inheritDoc} */
    public Set<E> range(E from, E to) {
        checkValidKey(dynamicEnumValues, from, "'from' may not be null", "dynamic enum constant");
        checkValidKey(dynamicEnumValues, to, "'to' may not be null", "dynamic enum constant");

        if (compare(from, to) > 0) {
            throw new IllegalArgumentException("Invalid endpoints: " + from
                    + " > " + to);
        }

        // assume the above checks mean the endpoints are also valid for the
        // ordered list
        assert (orderedDynamicEnumValues.contains(from) && orderedDynamicEnumValues.contains(to) 
                && (orderedDynamicEnumValues.indexOf(from) <= orderedDynamicEnumValues.indexOf(to)));

        // subList treats the "to" index as *exclusive*, but *inclusive* is
        // required here
        return new HashSet<E>(orderedDynamicEnumValues.subList(
                orderedDynamicEnumValues.indexOf(from), orderedDynamicEnumValues.indexOf(to) + 1));
    }

    /** {@inheritDoc} */
    public D backingValueOf(E enumValue) {
        checkValidKey(dynamicEnumValues, enumValue, "'enumValue' may not be null", 
                      "dynamic enum constant");
        return dynamicEnumValues.get(enumValue).backingObject;
    }

}
