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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lcsDaccpDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsDaccpDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdbscal_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cddtpct_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inaccteg_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incapit_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inincr_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtfixe_19" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rfpalier_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txpercep_19" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsDaccpDto", propOrder = {
    "cdbscal19",
    "cddtpct19",
    "inaccteg19",
    "incapit19",
    "inincr19",
    "mtfixe19",
    "rfpalier19",
    "txpercep19"
})
public class LcsDaccpDto {

    @XmlElement(name = "cdbscal_19")
    protected String cdbscal19;
    @XmlElement(name = "cddtpct_19")
    protected String cddtpct19;
    @XmlElement(name = "inaccteg_19")
    protected String inaccteg19;
    @XmlElement(name = "incapit_19")
    protected String incapit19;
    @XmlElement(name = "inincr_19")
    protected String inincr19;
    @XmlElement(name = "mtfixe_19")
    protected Double mtfixe19;
    @XmlElement(name = "rfpalier_19")
    protected String rfpalier19;
    @XmlElement(name = "txpercep_19")
    protected Double txpercep19;

    /**
     * Obtient la valeur de la propriété cdbscal19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbscal19() {
        return cdbscal19;
    }

    /**
     * Définit la valeur de la propriété cdbscal19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbscal19(String value) {
        this.cdbscal19 = value;
    }

    /**
     * Obtient la valeur de la propriété cddtpct19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCddtpct19() {
        return cddtpct19;
    }

    /**
     * Définit la valeur de la propriété cddtpct19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCddtpct19(String value) {
        this.cddtpct19 = value;
    }

    /**
     * Obtient la valeur de la propriété inaccteg19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInaccteg19() {
        return inaccteg19;
    }

    /**
     * Définit la valeur de la propriété inaccteg19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInaccteg19(String value) {
        this.inaccteg19 = value;
    }

    /**
     * Obtient la valeur de la propriété incapit19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncapit19() {
        return incapit19;
    }

    /**
     * Définit la valeur de la propriété incapit19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncapit19(String value) {
        this.incapit19 = value;
    }

    /**
     * Obtient la valeur de la propriété inincr19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInincr19() {
        return inincr19;
    }

    /**
     * Définit la valeur de la propriété inincr19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInincr19(String value) {
        this.inincr19 = value;
    }

    /**
     * Obtient la valeur de la propriété mtfixe19.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtfixe19() {
        return mtfixe19;
    }

    /**
     * Définit la valeur de la propriété mtfixe19.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtfixe19(Double value) {
        this.mtfixe19 = value;
    }

    /**
     * Obtient la valeur de la propriété rfpalier19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpalier19() {
        return rfpalier19;
    }

    /**
     * Définit la valeur de la propriété rfpalier19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpalier19(String value) {
        this.rfpalier19 = value;
    }

    /**
     * Obtient la valeur de la propriété txpercep19.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTxpercep19() {
        return txpercep19;
    }

    /**
     * Définit la valeur de la propriété txpercep19.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTxpercep19(Double value) {
        this.txpercep19 = value;
    }

}
