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
 * <p>Classe Java pour lcsTADto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsTADto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessoires" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="assurances" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cdterm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="crdu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dtech" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="echeance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="interets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="somme_capital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="somme_crd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="stdu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsTADto", propOrder = {
    "accessoires",
    "assurances",
    "capital",
    "cdterm",
    "crdu",
    "dtech",
    "echeance",
    "interets",
    "sommeCapital",
    "sommeCrd",
    "stdu"
})
public class LcsTADto {

    protected Double accessoires;
    protected Double assurances;
    protected Double capital;
    protected int cdterm;
    protected Double crdu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtech;
    protected double echeance;
    protected Double interets;
    @XmlElement(name = "somme_capital")
    protected Double sommeCapital;
    @XmlElement(name = "somme_crd")
    protected Double sommeCrd;
    protected Double stdu;

    /**
     * Obtient la valeur de la propriété accessoires.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccessoires() {
        return accessoires;
    }

    /**
     * Définit la valeur de la propriété accessoires.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccessoires(Double value) {
        this.accessoires = value;
    }

    /**
     * Obtient la valeur de la propriété assurances.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAssurances() {
        return assurances;
    }

    /**
     * Définit la valeur de la propriété assurances.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAssurances(Double value) {
        this.assurances = value;
    }

    /**
     * Obtient la valeur de la propriété capital.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapital() {
        return capital;
    }

    /**
     * Définit la valeur de la propriété capital.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapital(Double value) {
        this.capital = value;
    }

    /**
     * Obtient la valeur de la propriété cdterm.
     * 
     */
    public int getCdterm() {
        return cdterm;
    }

    /**
     * Définit la valeur de la propriété cdterm.
     * 
     */
    public void setCdterm(int value) {
        this.cdterm = value;
    }

    /**
     * Obtient la valeur de la propriété crdu.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrdu() {
        return crdu;
    }

    /**
     * Définit la valeur de la propriété crdu.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrdu(Double value) {
        this.crdu = value;
    }

    /**
     * Obtient la valeur de la propriété dtech.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtech() {
        return dtech;
    }

    /**
     * Définit la valeur de la propriété dtech.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtech(XMLGregorianCalendar value) {
        this.dtech = value;
    }

    /**
     * Obtient la valeur de la propriété echeance.
     * 
     */
    public double getEcheance() {
        return echeance;
    }

    /**
     * Définit la valeur de la propriété echeance.
     * 
     */
    public void setEcheance(double value) {
        this.echeance = value;
    }

    /**
     * Obtient la valeur de la propriété interets.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInterets() {
        return interets;
    }

    /**
     * Définit la valeur de la propriété interets.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInterets(Double value) {
        this.interets = value;
    }

    /**
     * Obtient la valeur de la propriété sommeCapital.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSommeCapital() {
        return sommeCapital;
    }

    /**
     * Définit la valeur de la propriété sommeCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSommeCapital(Double value) {
        this.sommeCapital = value;
    }

    /**
     * Obtient la valeur de la propriété sommeCrd.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSommeCrd() {
        return sommeCrd;
    }

    /**
     * Définit la valeur de la propriété sommeCrd.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSommeCrd(Double value) {
        this.sommeCrd = value;
    }

    /**
     * Obtient la valeur de la propriété stdu.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdu() {
        return stdu;
    }

    /**
     * Définit la valeur de la propriété stdu.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdu(Double value) {
        this.stdu = value;
    }

}
