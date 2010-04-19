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
 * Java class for group element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="group">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}dimension"/>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}variable"/>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}attribute"/>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}group"/>
 *           &lt;element ref="{http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2}remove"/>
 *         &lt;/choice>
 *         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dimensionOrVariableOrAttribute" })
@XmlRootElement(name = "group", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2")
public class Group {

    @XmlElements( {
            @XmlElement(name = "remove", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Remove.class),
            @XmlElement(name = "dimension", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Dimension.class),
            @XmlElement(name = "attribute", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Attribute.class),
            @XmlElement(name = "group", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Group.class),
            @XmlElement(name = "variable", namespace = "http://www.unidata.ucar.edu/namespaces/netcdf/ncml-2.2", required = true, type = Variable.class) })
    protected List<Object> dimensionOrVariableOrAttribute;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String orgName;

    /**
     * Gets the value of the dimensionOrVariableOrAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification
     * you make to the returned list will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dimensionOrVariableOrAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDimensionOrVariableOrAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Remove } {@link Dimension }
     * {@link Attribute } {@link Group } {@link Variable }
     * 
     * 
     */
    public List<Object> getDimensionOrVariableOrAttribute() {
        if (dimensionOrVariableOrAttribute == null) {
            dimensionOrVariableOrAttribute = new ArrayList<Object>();
        }
        return this.dimensionOrVariableOrAttribute;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

}
