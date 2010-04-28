//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.28 at 04:21:05 PM CEST 
//


package fr.cls.atoll.motu.api.message.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 					R�ponse � une requete d'extraction en mode
 * 					'status'
 * 				
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}codeMsg"/>
 *       &lt;attribute name="status" type="{}statusModeType" />
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dateProc" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="remoteUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "statusModeResponse")
public class StatusModeResponse {

    @XmlAttribute
    protected StatusModeType status;
    @XmlAttribute
    protected Long requestId;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateProc;
    @XmlAttribute
    protected Double size;
    @XmlAttribute
    protected String remoteUri;
    @XmlAttribute
    protected String localUri;
    @XmlAttribute
    protected String msg;
    @XmlAttribute
    protected ErrorType code;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusModeType }
     *     
     */
    public StatusModeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusModeType }
     *     
     */
    public void setStatus(StatusModeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestId(Long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the dateProc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateProc() {
        return dateProc;
    }

    /**
     * Sets the value of the dateProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateProc(XMLGregorianCalendar value) {
        this.dateProc = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Gets the value of the remoteUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteUri() {
        return remoteUri;
    }

    /**
     * Sets the value of the remoteUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteUri(String value) {
        this.remoteUri = value;
    }

    /**
     * Gets the value of the localUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalUri() {
        return localUri;
    }

    /**
     * Sets the value of the localUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalUri(String value) {
        this.localUri = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setCode(ErrorType value) {
        this.code = value;
    }

}
