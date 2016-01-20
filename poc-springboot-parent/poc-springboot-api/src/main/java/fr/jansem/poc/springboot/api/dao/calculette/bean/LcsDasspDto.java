//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.20 à 11:33:20 AM CET 
//


package fr.jansem.poc.springboot.api.dao.calculette.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour lcsDasspDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsDasspDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdbscal_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cddtpct_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtfpct_20" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="inasstaea_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inassteg_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incapit_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inincr_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtfixe_20" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rfpalier_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txpercep_20" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsDasspDto", propOrder = {
    "cdbscal20",
    "cddtpct20",
    "dtfpct20",
    "inasstaea20",
    "inassteg20",
    "incapit20",
    "inincr20",
    "mtfixe20",
    "rfpalier20",
    "txpercep20"
})
public class LcsDasspDto {

    @XmlElement(name = "cdbscal_20")
    protected String cdbscal20;
    @XmlElement(name = "cddtpct_20")
    protected String cddtpct20;
    @XmlElement(name = "dtfpct_20")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtfpct20;
    @XmlElement(name = "inasstaea_20")
    protected String inasstaea20;
    @XmlElement(name = "inassteg_20")
    protected String inassteg20;
    @XmlElement(name = "incapit_20")
    protected String incapit20;
    @XmlElement(name = "inincr_20")
    protected String inincr20;
    @XmlElement(name = "mtfixe_20")
    protected Double mtfixe20;
    @XmlElement(name = "rfpalier_20")
    protected String rfpalier20;
    @XmlElement(name = "txpercep_20")
    protected Double txpercep20;

    /**
     * Obtient la valeur de la propriété cdbscal20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbscal20() {
        return cdbscal20;
    }

    /**
     * Définit la valeur de la propriété cdbscal20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbscal20(String value) {
        this.cdbscal20 = value;
    }

    /**
     * Obtient la valeur de la propriété cddtpct20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCddtpct20() {
        return cddtpct20;
    }

    /**
     * Définit la valeur de la propriété cddtpct20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCddtpct20(String value) {
        this.cddtpct20 = value;
    }

    /**
     * Obtient la valeur de la propriété dtfpct20.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtfpct20() {
        return dtfpct20;
    }

    /**
     * Définit la valeur de la propriété dtfpct20.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtfpct20(XMLGregorianCalendar value) {
        this.dtfpct20 = value;
    }

    /**
     * Obtient la valeur de la propriété inasstaea20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInasstaea20() {
        return inasstaea20;
    }

    /**
     * Définit la valeur de la propriété inasstaea20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInasstaea20(String value) {
        this.inasstaea20 = value;
    }

    /**
     * Obtient la valeur de la propriété inassteg20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInassteg20() {
        return inassteg20;
    }

    /**
     * Définit la valeur de la propriété inassteg20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInassteg20(String value) {
        this.inassteg20 = value;
    }

    /**
     * Obtient la valeur de la propriété incapit20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncapit20() {
        return incapit20;
    }

    /**
     * Définit la valeur de la propriété incapit20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncapit20(String value) {
        this.incapit20 = value;
    }

    /**
     * Obtient la valeur de la propriété inincr20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInincr20() {
        return inincr20;
    }

    /**
     * Définit la valeur de la propriété inincr20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInincr20(String value) {
        this.inincr20 = value;
    }

    /**
     * Obtient la valeur de la propriété mtfixe20.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtfixe20() {
        return mtfixe20;
    }

    /**
     * Définit la valeur de la propriété mtfixe20.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtfixe20(Double value) {
        this.mtfixe20 = value;
    }

    /**
     * Obtient la valeur de la propriété rfpalier20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpalier20() {
        return rfpalier20;
    }

    /**
     * Définit la valeur de la propriété rfpalier20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpalier20(String value) {
        this.rfpalier20 = value;
    }

    /**
     * Obtient la valeur de la propriété txpercep20.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTxpercep20() {
        return txpercep20;
    }

    /**
     * Définit la valeur de la propriété txpercep20.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTxpercep20(Double value) {
        this.txpercep20 = value;
    }

}
