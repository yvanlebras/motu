//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-3268 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.25 at 11:44:51 AM CET 
//

package fr.cls.atoll.motu.library.misc.tds.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sort element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="sort">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice>
 *           &lt;element name="lexigraphicByName">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="increasing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="crawlableDatasetSorterImpl" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}UserImplType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "lexigraphicByName", "crawlableDatasetSorterImpl" })
@XmlRootElement(name = "sort")
public class Sort {

    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected LexigraphicByName lexigraphicByName;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected UserImplType crawlableDatasetSorterImpl;

    /**
     * Gets the value of the lexigraphicByName property.
     * 
     * @return possible object is {@link LexigraphicByName }
     * 
     */
    public LexigraphicByName getLexigraphicByName() {
        return lexigraphicByName;
    }

    /**
     * Sets the value of the lexigraphicByName property.
     * 
     * @param value allowed object is {@link LexigraphicByName }
     * 
     */
    public void setLexigraphicByName(LexigraphicByName value) {
        this.lexigraphicByName = value;
    }

    /**
     * Gets the value of the crawlableDatasetSorterImpl property.
     * 
     * @return possible object is {@link UserImplType }
     * 
     */
    public UserImplType getCrawlableDatasetSorterImpl() {
        return crawlableDatasetSorterImpl;
    }

    /**
     * Sets the value of the crawlableDatasetSorterImpl property.
     * 
     * @param value allowed object is {@link UserImplType }
     * 
     */
    public void setCrawlableDatasetSorterImpl(UserImplType value) {
        this.crawlableDatasetSorterImpl = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="increasing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LexigraphicByName {

        @XmlAttribute
        protected Boolean increasing;

        /**
         * Gets the value of the increasing property.
         * 
         * @return possible object is {@link Boolean }
         * 
         */
        public Boolean isIncreasing() {
            return increasing;
        }

        /**
         * Sets the value of the increasing property.
         * 
         * @param value allowed object is {@link Boolean }
         * 
         */
        public void setIncreasing(Boolean value) {
            this.increasing = value;
        }

    }

}
