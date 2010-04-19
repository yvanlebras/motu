//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.01 at 05:10:30 PM CET 
//


package fr.cls.atoll.motu.library.misc.inventory;

import java.net.URI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import fr.cls.atoll.motu.library.misc.converter.jaxb.UriAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/cls/atoll}access"/>
 *         &lt;element ref="{http://purl.org/cls/atoll}geospatialCoverage"/>
 *         &lt;element ref="{http://purl.org/cls/atoll}depthCoverage" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/cls/atoll}timePeriod"/>
 *         &lt;element ref="{http://purl.org/cls/atoll}theoricalTimePeriod"/>
 *         &lt;element ref="{http://purl.org/cls/atoll}variables"/>
 *       &lt;/sequence>
 *       &lt;attribute name="urn" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "access",
    "geospatialCoverage",
    "depthCoverage",
    "timePeriod",
    "theoricalTimePeriod",
    "variables"
})
@XmlRootElement(name = "resource")
public class Resource {

    @XmlElement(required = true)
    protected Access access;
    @XmlElement(required = true)
    protected GeospatialCoverage geospatialCoverage;
    protected DepthCoverage depthCoverage;
    @XmlElement(required = true)
    protected TimePeriod timePeriod;
    @XmlElement(required = true)
    protected TheoricalTimePeriod theoricalTimePeriod;
    @XmlElement(required = true)
    protected Variables variables;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(UriAdapter.class)
    @XmlSchemaType(name = "anyURI")
    protected URI urn;
    @XmlAttribute
    protected String internalId;

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link Access }
     *     
     */
    public Access getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link Access }
     *     
     */
    public void setAccess(Access value) {
        this.access = value;
    }

    /**
     * Gets the value of the geospatialCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link GeospatialCoverage }
     *     
     */
    public GeospatialCoverage getGeospatialCoverage() {
        return geospatialCoverage;
    }

    /**
     * Sets the value of the geospatialCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialCoverage }
     *     
     */
    public void setGeospatialCoverage(GeospatialCoverage value) {
        this.geospatialCoverage = value;
    }

    /**
     * Gets the value of the depthCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link DepthCoverage }
     *     
     */
    public DepthCoverage getDepthCoverage() {
        return depthCoverage;
    }

    /**
     * Sets the value of the depthCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthCoverage }
     *     
     */
    public void setDepthCoverage(DepthCoverage value) {
        this.depthCoverage = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setTimePeriod(TimePeriod value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the theoricalTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TheoricalTimePeriod }
     *     
     */
    public TheoricalTimePeriod getTheoricalTimePeriod() {
        return theoricalTimePeriod;
    }

    /**
     * Sets the value of the theoricalTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TheoricalTimePeriod }
     *     
     */
    public void setTheoricalTimePeriod(TheoricalTimePeriod value) {
        this.theoricalTimePeriod = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link Variables }
     *     
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variables }
     *     
     */
    public void setVariables(Variables value) {
        this.variables = value;
    }

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getUrn() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrn(URI value) {
        this.urn = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

}