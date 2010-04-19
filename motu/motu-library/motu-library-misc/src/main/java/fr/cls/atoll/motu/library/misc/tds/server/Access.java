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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for access element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="access">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}dataSize" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="dataFormat" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}dataFormatTypes" />
 *         &lt;attribute name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="urlPath" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dataSize" })
@XmlRootElement(name = "access")
public class Access {

    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected DataSize dataSize;
    @XmlAttribute
    protected String dataFormat;
    @XmlAttribute
    protected String serviceName;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String urlPath;

    /**
     * Gets the value of the dataSize property.
     * 
     * @return possible object is {@link DataSize }
     * 
     */
    public DataSize getDataSize() {
        return dataSize;
    }

    /**
     * Sets the value of the dataSize property.
     * 
     * @param value allowed object is {@link DataSize }
     * 
     */
    public void setDataSize(DataSize value) {
        this.dataSize = value;
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDataFormat(String value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the urlPath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * Sets the value of the urlPath property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUrlPath(String value) {
        this.urlPath = value;
    }

}
