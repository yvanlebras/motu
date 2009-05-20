//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.05.20 at 04:52:00 PM CEST 
//


package fr.cls.atoll.motu.library.inventory;

import javax.measure.DecimalMeasure;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import fr.cls.atoll.motu.library.converter.jaxb.DecimalMeasureAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="west" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="eastResolution" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="south" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="east" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="northResolution" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="north" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geospatialCoverage")
public class GeospatialCoverage {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure west;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure eastResolution;
    @XmlAttribute(required = true)
    protected String units;
    @XmlAttribute(required = true)
    protected String type;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure south;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure east;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure northResolution;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(DecimalMeasureAdapter.class)
    @XmlSchemaType(name = "decimal")
    protected DecimalMeasure north;

    /**
     * Gets the value of the west property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getWest() {
        return west;
    }

    /**
     * Sets the value of the west property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWest(DecimalMeasure value) {
        this.west = value;
    }

    /**
     * Gets the value of the eastResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getEastResolution() {
        return eastResolution;
    }

    /**
     * Sets the value of the eastResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEastResolution(DecimalMeasure value) {
        this.eastResolution = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the south property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getSouth() {
        return south;
    }

    /**
     * Sets the value of the south property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSouth(DecimalMeasure value) {
        this.south = value;
    }

    /**
     * Gets the value of the east property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getEast() {
        return east;
    }

    /**
     * Sets the value of the east property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEast(DecimalMeasure value) {
        this.east = value;
    }

    /**
     * Gets the value of the northResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getNorthResolution() {
        return northResolution;
    }

    /**
     * Sets the value of the northResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorthResolution(DecimalMeasure value) {
        this.northResolution = value;
    }

    /**
     * Gets the value of the north property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DecimalMeasure getNorth() {
        return north;
    }

    /**
     * Sets the value of the north property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorth(DecimalMeasure value) {
        this.north = value;
    }

}
