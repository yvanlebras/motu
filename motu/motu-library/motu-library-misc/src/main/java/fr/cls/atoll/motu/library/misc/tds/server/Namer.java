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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for namer element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="namer">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="regExpOnName" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}NamerSelectorType"/>
 *           &lt;element name="regExpOnPath" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}NamerSelectorType"/>
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
@XmlType(name = "", propOrder = { "regExpOnNameOrRegExpOnPath" })
@XmlRootElement(name = "namer")
public class Namer {

    @XmlElementRefs( {
            @XmlElementRef(name = "regExpOnName", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class),
            @XmlElementRef(name = "regExpOnPath", namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0", type = JAXBElement.class) })
    protected List<JAXBElement<NamerSelectorType>> regExpOnNameOrRegExpOnPath;

    /**
     * Gets the value of the regExpOnNameOrRegExpOnPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification
     * you make to the returned list will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the regExpOnNameOrRegExpOnPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRegExpOnNameOrRegExpOnPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}
     * {@link NamerSelectorType }{@code >} {@link JAXBElement }{@code <}{@link NamerSelectorType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<NamerSelectorType>> getRegExpOnNameOrRegExpOnPath() {
        if (regExpOnNameOrRegExpOnPath == null) {
            regExpOnNameOrRegExpOnPath = new ArrayList<JAXBElement<NamerSelectorType>>();
        }
        return this.regExpOnNameOrRegExpOnPath;
    }

}
