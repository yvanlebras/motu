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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="3" minOccurs="2">
 *           &lt;element name="start" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}dateTypeFormatted"/>
 *           &lt;element name="end" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}dateTypeFormatted"/>
 *           &lt;element name="duration" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}duration"/>
 *         &lt;/choice>
 *         &lt;element name="resolution" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeCoverageType", propOrder = {
    "startOrEndOrDuration",
    "resolution"
})
public class TimeCoverageType {

    @XmlElementRefs({
        @XmlElementRef(name = "end", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "start", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "duration", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> startOrEndOrDuration;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected String resolution;

    /**
     * Gets the value of the startOrEndOrDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startOrEndOrDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartOrEndOrDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTypeFormatted }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTypeFormatted }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getStartOrEndOrDuration() {
        if (startOrEndOrDuration == null) {
            startOrEndOrDuration = new ArrayList<JAXBElement<?>>();
        }
        return this.startOrEndOrDuration;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

}
