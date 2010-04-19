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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}DatasetType">
 *       &lt;sequence>
 *         &lt;element name="crawlableDatasetImpl" type="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}UserImplType" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}filter" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}addID" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}namer" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}sort" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}addLatest" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}addProxies" minOccurs="0"/>
 *         &lt;element name="addDatasetSize" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0}addTimeCoverage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="addDatasetSize" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="addId" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="addLatest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dirLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crawlableDatasetImpl",
    "filter",
    "addID",
    "namer",
    "sort",
    "addLatest",
    "addProxies",
    "addDatasetSize",
    "addTimeCoverage"
})
public class DatasetScan
    extends DatasetType
{

    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected UserImplType crawlableDatasetImpl;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected Filter filter;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected AddID addID;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected Namer namer;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected Sort sort;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected AddLatest addLatest;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected AddProxies addProxies;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected Object addDatasetSize;
    @XmlElement(namespace = "http://www.unidata.ucar.edu/namespaces/thredds/InvCatalog/v1.0")
    protected AddTimeCoverage addTimeCoverage;
    @XmlAttribute(name = "addDatasetSize")
    protected Boolean addDatasetSizeDeprecated;
    @XmlAttribute(name = "addId")
    protected Boolean addIdDeprecated;
    @XmlAttribute(name = "addLatest")
    protected Boolean addLatestDeprecated;
    @XmlAttribute(name = "dirLocation")
    protected String dirLocationDeprecated;
    @XmlAttribute(name = "filter")
    protected String filterDeprecated;
    @XmlAttribute
    protected String location;
    @XmlAttribute(required = true)
    protected String path;

    /**
     * Gets the value of the crawlableDatasetImpl property.
     * 
     * @return
     *     possible object is
     *     {@link UserImplType }
     *     
     */
    public UserImplType getCrawlableDatasetImpl() {
        return crawlableDatasetImpl;
    }

    /**
     * Sets the value of the crawlableDatasetImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserImplType }
     *     
     */
    public void setCrawlableDatasetImpl(UserImplType value) {
        this.crawlableDatasetImpl = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the addID property.
     * 
     * @return
     *     possible object is
     *     {@link AddID }
     *     
     */
    public AddID getAddID() {
        return addID;
    }

    /**
     * Sets the value of the addID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddID }
     *     
     */
    public void setAddID(AddID value) {
        this.addID = value;
    }

    /**
     * Gets the value of the namer property.
     * 
     * @return
     *     possible object is
     *     {@link Namer }
     *     
     */
    public Namer getNamer() {
        return namer;
    }

    /**
     * Sets the value of the namer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Namer }
     *     
     */
    public void setNamer(Namer value) {
        this.namer = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link Sort }
     *     
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sort }
     *     
     */
    public void setSort(Sort value) {
        this.sort = value;
    }

    /**
     * Gets the value of the addLatest property.
     * 
     * @return
     *     possible object is
     *     {@link AddLatest }
     *     
     */
    public AddLatest getAddLatest() {
        return addLatest;
    }

    /**
     * Sets the value of the addLatest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddLatest }
     *     
     */
    public void setAddLatest(AddLatest value) {
        this.addLatest = value;
    }

    /**
     * Gets the value of the addProxies property.
     * 
     * @return
     *     possible object is
     *     {@link AddProxies }
     *     
     */
    public AddProxies getAddProxies() {
        return addProxies;
    }

    /**
     * Sets the value of the addProxies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddProxies }
     *     
     */
    public void setAddProxies(AddProxies value) {
        this.addProxies = value;
    }

    /**
     * Gets the value of the addDatasetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAddDatasetSize() {
        return addDatasetSize;
    }

    /**
     * Sets the value of the addDatasetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAddDatasetSize(Object value) {
        this.addDatasetSize = value;
    }

    /**
     * Gets the value of the addTimeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link AddTimeCoverage }
     *     
     */
    public AddTimeCoverage getAddTimeCoverage() {
        return addTimeCoverage;
    }

    /**
     * Sets the value of the addTimeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddTimeCoverage }
     *     
     */
    public void setAddTimeCoverage(AddTimeCoverage value) {
        this.addTimeCoverage = value;
    }

    /**
     * Gets the value of the addDatasetSizeDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddDatasetSizeDeprecated() {
        return addDatasetSizeDeprecated;
    }

    /**
     * Sets the value of the addDatasetSizeDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddDatasetSizeDeprecated(Boolean value) {
        this.addDatasetSizeDeprecated = value;
    }

    /**
     * Gets the value of the addIdDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddIdDeprecated() {
        return addIdDeprecated;
    }

    /**
     * Sets the value of the addIdDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddIdDeprecated(Boolean value) {
        this.addIdDeprecated = value;
    }

    /**
     * Gets the value of the addLatestDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddLatestDeprecated() {
        return addLatestDeprecated;
    }

    /**
     * Sets the value of the addLatestDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddLatestDeprecated(Boolean value) {
        this.addLatestDeprecated = value;
    }

    /**
     * Gets the value of the dirLocationDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirLocationDeprecated() {
        return dirLocationDeprecated;
    }

    /**
     * Sets the value of the dirLocationDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirLocationDeprecated(String value) {
        this.dirLocationDeprecated = value;
    }

    /**
     * Gets the value of the filterDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterDeprecated() {
        return filterDeprecated;
    }

    /**
     * Sets the value of the filterDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterDeprecated(String value) {
        this.filterDeprecated = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
