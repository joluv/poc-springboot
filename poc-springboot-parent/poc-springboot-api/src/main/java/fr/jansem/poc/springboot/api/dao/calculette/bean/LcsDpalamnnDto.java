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
 * <p>Classe Java pour lcsDpalamnnDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsDpalamnnDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capamort_18" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cdcalcr_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdjexact_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdmcaltx_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdtypint_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constrb_18" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="incapfp_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incapit_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incje_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nbtermp_18" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="peint_18" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="txint_77" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsDpalamnnDto", propOrder = {
    "capamort18",
    "cdcalcr18",
    "cdjexact77",
    "cdmcaltx77",
    "cdtypint18",
    "constrb18",
    "incapfp18",
    "incapit18",
    "incje77",
    "nbtermp18",
    "peint18",
    "txint77"
})
public class LcsDpalamnnDto {

    @XmlElement(name = "capamort_18")
    protected Double capamort18;
    @XmlElement(name = "cdcalcr_18")
    protected String cdcalcr18;
    @XmlElement(name = "cdjexact_77")
    protected String cdjexact77;
    @XmlElement(name = "cdmcaltx_77")
    protected String cdmcaltx77;
    @XmlElement(name = "cdtypint_18")
    protected String cdtypint18;
    @XmlElement(name = "constrb_18")
    protected Double constrb18;
    @XmlElement(name = "incapfp_18")
    protected String incapfp18;
    @XmlElement(name = "incapit_18")
    protected String incapit18;
    @XmlElement(name = "incje_77")
    protected String incje77;
    @XmlElement(name = "nbtermp_18")
    protected int nbtermp18;
    @XmlElement(name = "peint_18")
    protected int peint18;
    @XmlElement(name = "txint_77")
    protected Double txint77;

    /**
     * Obtient la valeur de la propriété capamort18.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapamort18() {
        return capamort18;
    }

    /**
     * Définit la valeur de la propriété capamort18.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapamort18(Double value) {
        this.capamort18 = value;
    }

    /**
     * Obtient la valeur de la propriété cdcalcr18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdcalcr18() {
        return cdcalcr18;
    }

    /**
     * Définit la valeur de la propriété cdcalcr18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdcalcr18(String value) {
        this.cdcalcr18 = value;
    }

    /**
     * Obtient la valeur de la propriété cdjexact77.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdjexact77() {
        return cdjexact77;
    }

    /**
     * Définit la valeur de la propriété cdjexact77.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdjexact77(String value) {
        this.cdjexact77 = value;
    }

    /**
     * Obtient la valeur de la propriété cdmcaltx77.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmcaltx77() {
        return cdmcaltx77;
    }

    /**
     * Définit la valeur de la propriété cdmcaltx77.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmcaltx77(String value) {
        this.cdmcaltx77 = value;
    }

    /**
     * Obtient la valeur de la propriété cdtypint18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtypint18() {
        return cdtypint18;
    }

    /**
     * Définit la valeur de la propriété cdtypint18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtypint18(String value) {
        this.cdtypint18 = value;
    }

    /**
     * Obtient la valeur de la propriété constrb18.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConstrb18() {
        return constrb18;
    }

    /**
     * Définit la valeur de la propriété constrb18.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConstrb18(Double value) {
        this.constrb18 = value;
    }

    /**
     * Obtient la valeur de la propriété incapfp18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncapfp18() {
        return incapfp18;
    }

    /**
     * Définit la valeur de la propriété incapfp18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncapfp18(String value) {
        this.incapfp18 = value;
    }

    /**
     * Obtient la valeur de la propriété incapit18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncapit18() {
        return incapit18;
    }

    /**
     * Définit la valeur de la propriété incapit18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncapit18(String value) {
        this.incapit18 = value;
    }

    /**
     * Obtient la valeur de la propriété incje77.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncje77() {
        return incje77;
    }

    /**
     * Définit la valeur de la propriété incje77.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncje77(String value) {
        this.incje77 = value;
    }

    /**
     * Obtient la valeur de la propriété nbtermp18.
     * 
     */
    public int getNbtermp18() {
        return nbtermp18;
    }

    /**
     * Définit la valeur de la propriété nbtermp18.
     * 
     */
    public void setNbtermp18(int value) {
        this.nbtermp18 = value;
    }

    /**
     * Obtient la valeur de la propriété peint18.
     * 
     */
    public int getPeint18() {
        return peint18;
    }

    /**
     * Définit la valeur de la propriété peint18.
     * 
     */
    public void setPeint18(int value) {
        this.peint18 = value;
    }

    /**
     * Obtient la valeur de la propriété txint77.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTxint77() {
        return txint77;
    }

    /**
     * Définit la valeur de la propriété txint77.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTxint77(Double value) {
        this.txint77 = value;
    }

}
