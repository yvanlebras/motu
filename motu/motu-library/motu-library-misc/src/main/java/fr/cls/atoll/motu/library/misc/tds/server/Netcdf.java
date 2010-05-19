/* 
 * Motu, a high efficient, robust and Standard compliant Web Server for Geographic
 * Data Dissemination.
 *
 * http://cls-motu.sourceforge.net/
 *
 * (C) Copyright 2009-2010, by CLS (Collecte Localisation Satellites) - 
 * http://www.cls.fr - and  Contributors
 *
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-3268 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.25 at 11:44:51 AM CET 
//

package fr.cls.atoll.motu.library.misc.tds.server;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for netcdf element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="netcdf">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="readMetadata" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;element name="explicit" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;/choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}group"/>
 *             &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}dimension"/>
 *             &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}variable"/>
 *             &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}attribute"/>
 *             &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}remove"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}aggregation" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="addRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *         &lt;attribute name="coordValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="enhance" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *         &lt;attribute name="fmrcDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *         &lt;attribute name="ncoords" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "readMetadata", "explicit", "groupOrDimensionOrVariable", "aggregation" })
@XmlRootElement(name = "netcdf", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2")
public class Netcdf {

    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2")
    protected Object readMetadata;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2")
    protected Object explicit;
    @XmlElements( {
            @XmlElement(name = "attribute", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Attribute.class),
            @XmlElement(name = "dimension", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Dimension.class),
            @XmlElement(name = "variable", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Variable.class),
            @XmlElement(name = "group", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Group.class),
            @XmlElement(name = "remove", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Remove.class) })
    protected List<Object> groupOrDimensionOrVariable;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2")
    protected Aggregation aggregation;
    @XmlAttribute
    protected Boolean addRecords;
    @XmlAttribute
    protected String coordValue;
    @XmlAttribute
    protected Boolean enhance;
    @XmlAttribute
    protected String fmrcDefinition;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String location;
    @XmlAttribute
    protected String ncoords;
    @XmlAttribute
    protected String title;

    /**
     * Gets the value of the readMetadata property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getReadMetadata() {
        return readMetadata;
    }

    /**
     * Sets the value of the readMetadata property.
     * 
     * @param value allowed object is {@link Object }
     * 
     */
    public void setReadMetadata(Object value) {
        this.readMetadata = value;
    }

    /**
     * Gets the value of the explicit property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getExplicit() {
        return explicit;
    }

    /**
     * Sets the value of the explicit property.
     * 
     * @param value allowed object is {@link Object }
     * 
     */
    public void setExplicit(Object value) {
        this.explicit = value;
    }

    /**
     * Gets the value of the groupOrDimensionOrVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification
     * you make to the returned list will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the groupOrDimensionOrVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGroupOrDimensionOrVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Attribute } {@link Dimension }
     * {@link Variable } {@link Group } {@link Remove }
     * 
     * 
     */
    public List<Object> getGroupOrDimensionOrVariable() {
        if (groupOrDimensionOrVariable == null) {
            groupOrDimensionOrVariable = new ArrayList<Object>();
        }
        return this.groupOrDimensionOrVariable;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * @return possible object is {@link Aggregation }
     * 
     */
    public Aggregation getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value allowed object is {@link Aggregation }
     * 
     */
    public void setAggregation(Aggregation value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the addRecords property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isAddRecords() {
        return addRecords;
    }

    /**
     * Sets the value of the addRecords property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAddRecords(Boolean value) {
        this.addRecords = value;
    }

    /**
     * Gets the value of the coordValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCoordValue() {
        return coordValue;
    }

    /**
     * Sets the value of the coordValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCoordValue(String value) {
        this.coordValue = value;
    }

    /**
     * Gets the value of the enhance property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isEnhance() {
        return enhance;
    }

    /**
     * Sets the value of the enhance property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setEnhance(Boolean value) {
        this.enhance = value;
    }

    /**
     * Gets the value of the fmrcDefinition property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFmrcDefinition() {
        return fmrcDefinition;
    }

    /**
     * Sets the value of the fmrcDefinition property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFmrcDefinition(String value) {
        this.fmrcDefinition = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the ncoords property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNcoords() {
        return ncoords;
    }

    /**
     * Sets the value of the ncoords property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNcoords(String value) {
        this.ncoords = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
