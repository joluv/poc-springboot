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
 * <p>Classe Java pour lcsDpalfrDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsDpalfrDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdjexact_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdmcaltx_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dureefr_18" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="incapfp_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incapit_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incje_77" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peint_18" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="txint_77" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsDpalfrDto", propOrder = {
    "cdjexact77",
    "cdmcaltx77",
    "dureefr18",
    "incapfp18",
    "incapit18",
    "incje77",
    "peint18",
    "txint77"
})
public class LcsDpalfrDto {

    @XmlElement(name = "cdjexact_77")
    protected String cdjexact77;
    @XmlElement(name = "cdmcaltx_77")
    protected String cdmcaltx77;
    @XmlElement(name = "dureefr_18")
    protected int dureefr18;
    @XmlElement(name = "incapfp_18")
    protected String incapfp18;
    @XmlElement(name = "incapit_18")
    protected String incapit18;
    @XmlElement(name = "incje_77")
    protected String incje77;
    @XmlElement(name = "peint_18")
    protected int peint18;
    @XmlElement(name = "txint_77")
    protected double txint77;

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
     * Obtient la valeur de la propriété dureefr18.
     * 
     */
    public int getDureefr18() {
        return dureefr18;
    }

    /**
     * Définit la valeur de la propriété dureefr18.
     * 
     */
    public void setDureefr18(int value) {
        this.dureefr18 = value;
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
     */
    public double getTxint77() {
        return txint77;
    }

    /**
     * Définit la valeur de la propriété txint77.
     * 
     */
    public void setTxint77(double value) {
        this.txint77 = value;
    }

}
