//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.20 à 11:33:20 AM CET 
//


package fr.jansem.poc.springboot.api.dao.calculette.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour lcsSmk000DataInDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsSmk000DataInDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ajustech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdfonc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daccp" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsDaccpDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dassp" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsDasspDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dpalamnn" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsDpalamnnDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dpalfr" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsDpalfrDto" minOccurs="0"/&gt;
 *         &lt;element name="dtech_12" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dtreal_12" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="duree_12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="incje_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inedta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdcaltaea_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mdcalteg_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nominal_12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="teg_12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsSmk000DataInDto", propOrder = {
    "ajustech",
    "cdfonc",
    "daccp",
    "dassp",
    "dpalamnn",
    "dpalfr",
    "dtech12",
    "dtreal12",
    "duree12",
    "incje12",
    "inedta",
    "mdcaltaea12",
    "mdcalteg12",
    "nominal12",
    "teg12"
})
public class LcsSmk000DataInDto {

    protected String ajustech;
    protected String cdfonc;
    @XmlElement(nillable = true)
    protected List<LcsDaccpDto> daccp;
    @XmlElement(nillable = true)
    protected List<LcsDasspDto> dassp;
    @XmlElement(nillable = true)
    protected List<LcsDpalamnnDto> dpalamnn;
    protected LcsDpalfrDto dpalfr;
    @XmlElement(name = "dtech_12")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtech12;
    @XmlElement(name = "dtreal_12")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtreal12;
    @XmlElement(name = "duree_12")
    protected Integer duree12;
    @XmlElement(name = "incje_12")
    protected String incje12;
    protected String inedta;
    @XmlElement(name = "mdcaltaea_12")
    protected String mdcaltaea12;
    @XmlElement(name = "mdcalteg_12")
    protected String mdcalteg12;
    @XmlElement(name = "nominal_12")
    protected Double nominal12;
    @XmlElement(name = "teg_12")
    protected Double teg12;

    /**
     * Obtient la valeur de la propriété ajustech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAjustech() {
        return ajustech;
    }

    /**
     * Définit la valeur de la propriété ajustech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAjustech(String value) {
        this.ajustech = value;
    }

    /**
     * Obtient la valeur de la propriété cdfonc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdfonc() {
        return cdfonc;
    }

    /**
     * Définit la valeur de la propriété cdfonc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdfonc(String value) {
        this.cdfonc = value;
    }

    /**
     * Gets the value of the daccp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daccp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaccp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcsDaccpDto }
     * 
     * 
     */
    public List<LcsDaccpDto> getDaccp() {
        if (daccp == null) {
            daccp = new ArrayList<LcsDaccpDto>();
        }
        return this.daccp;
    }

    /**
     * Gets the value of the dassp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dassp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDassp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcsDasspDto }
     * 
     * 
     */
    public List<LcsDasspDto> getDassp() {
        if (dassp == null) {
            dassp = new ArrayList<LcsDasspDto>();
        }
        return this.dassp;
    }

    /**
     * Gets the value of the dpalamnn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpalamnn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpalamnn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcsDpalamnnDto }
     * 
     * 
     */
    public List<LcsDpalamnnDto> getDpalamnn() {
        if (dpalamnn == null) {
            dpalamnn = new ArrayList<LcsDpalamnnDto>();
        }
        return this.dpalamnn;
    }

    /**
     * Obtient la valeur de la propriété dpalfr.
     * 
     * @return
     *     possible object is
     *     {@link LcsDpalfrDto }
     *     
     */
    public LcsDpalfrDto getDpalfr() {
        return dpalfr;
    }

    /**
     * Définit la valeur de la propriété dpalfr.
     * 
     * @param value
     *     allowed object is
     *     {@link LcsDpalfrDto }
     *     
     */
    public void setDpalfr(LcsDpalfrDto value) {
        this.dpalfr = value;
    }

    /**
     * Obtient la valeur de la propriété dtech12.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtech12() {
        return dtech12;
    }

    /**
     * Définit la valeur de la propriété dtech12.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtech12(XMLGregorianCalendar value) {
        this.dtech12 = value;
    }

    /**
     * Obtient la valeur de la propriété dtreal12.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtreal12() {
        return dtreal12;
    }

    /**
     * Définit la valeur de la propriété dtreal12.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtreal12(XMLGregorianCalendar value) {
        this.dtreal12 = value;
    }

    /**
     * Obtient la valeur de la propriété duree12.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuree12() {
        return duree12;
    }

    /**
     * Définit la valeur de la propriété duree12.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuree12(Integer value) {
        this.duree12 = value;
    }

    /**
     * Obtient la valeur de la propriété incje12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncje12() {
        return incje12;
    }

    /**
     * Définit la valeur de la propriété incje12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncje12(String value) {
        this.incje12 = value;
    }

    /**
     * Obtient la valeur de la propriété inedta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInedta() {
        return inedta;
    }

    /**
     * Définit la valeur de la propriété inedta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInedta(String value) {
        this.inedta = value;
    }

    /**
     * Obtient la valeur de la propriété mdcaltaea12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcaltaea12() {
        return mdcaltaea12;
    }

    /**
     * Définit la valeur de la propriété mdcaltaea12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcaltaea12(String value) {
        this.mdcaltaea12 = value;
    }

    /**
     * Obtient la valeur de la propriété mdcalteg12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdcalteg12() {
        return mdcalteg12;
    }

    /**
     * Définit la valeur de la propriété mdcalteg12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdcalteg12(String value) {
        this.mdcalteg12 = value;
    }

    /**
     * Obtient la valeur de la propriété nominal12.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominal12() {
        return nominal12;
    }

    /**
     * Définit la valeur de la propriété nominal12.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominal12(Double value) {
        this.nominal12 = value;
    }

    /**
     * Obtient la valeur de la propriété teg12.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeg12() {
        return teg12;
    }

    /**
     * Définit la valeur de la propriété teg12.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeg12(Double value) {
        this.teg12 = value;
    }

}
