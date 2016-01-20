//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.20 à 11:33:20 AM CET 
//


package fr.jansem.poc.springboot.api.dao.calculette.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lcsTAPaliersDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsTAPaliersDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mtacc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mtass" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mtki" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nbmois" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nopal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nopech" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsTAPaliersDto", propOrder = {
    "mtacc",
    "mtass",
    "mtki",
    "nbmois",
    "nopal",
    "nopech"
})
public class LcsTAPaliersDto {

    protected Double mtacc;
    protected Double mtass;
    protected Double mtki;
    protected Integer nbmois;
    protected Integer nopal;
    protected Integer nopech;

    /**
     * Obtient la valeur de la propriété mtacc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtacc() {
        return mtacc;
    }

    /**
     * Définit la valeur de la propriété mtacc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtacc(Double value) {
        this.mtacc = value;
    }

    /**
     * Obtient la valeur de la propriété mtass.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtass() {
        return mtass;
    }

    /**
     * Définit la valeur de la propriété mtass.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtass(Double value) {
        this.mtass = value;
    }

    /**
     * Obtient la valeur de la propriété mtki.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtki() {
        return mtki;
    }

    /**
     * Définit la valeur de la propriété mtki.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtki(Double value) {
        this.mtki = value;
    }

    /**
     * Obtient la valeur de la propriété nbmois.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbmois() {
        return nbmois;
    }

    /**
     * Définit la valeur de la propriété nbmois.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbmois(Integer value) {
        this.nbmois = value;
    }

    /**
     * Obtient la valeur de la propriété nopal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNopal() {
        return nopal;
    }

    /**
     * Définit la valeur de la propriété nopal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNopal(Integer value) {
        this.nopal = value;
    }

    /**
     * Obtient la valeur de la propriété nopech.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNopech() {
        return nopech;
    }

    /**
     * Définit la valeur de la propriété nopech.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNopech(Integer value) {
        this.nopech = value;
    }

}
