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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lcsTABDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsTABDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mtacc" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mtass" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mtech" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paliers" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsTAPaliersDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="teg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totaccc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totassc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totassc_2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totintc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totmech" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsTABDto", propOrder = {
    "mtacc",
    "mtass",
    "mtech",
    "paliers",
    "taea",
    "teg",
    "totaccc",
    "totassc",
    "totassc2",
    "totintc",
    "totmech"
})
public class LcsTABDto {

    @XmlElement(nillable = true)
    protected List<Double> mtacc;
    @XmlElement(nillable = true)
    protected List<Double> mtass;
    protected Double mtech;
    @XmlElement(nillable = true)
    protected List<LcsTAPaliersDto> paliers;
    protected Double taea;
    protected Double teg;
    protected Double totaccc;
    protected Double totassc;
    @XmlElement(name = "totassc_2")
    protected Double totassc2;
    protected Double totintc;
    protected Double totmech;

    /**
     * Gets the value of the mtacc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtacc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtacc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMtacc() {
        if (mtacc == null) {
            mtacc = new ArrayList<Double>();
        }
        return this.mtacc;
    }

    /**
     * Gets the value of the mtass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMtass() {
        if (mtass == null) {
            mtass = new ArrayList<Double>();
        }
        return this.mtass;
    }

    /**
     * Obtient la valeur de la propriété mtech.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtech() {
        return mtech;
    }

    /**
     * Définit la valeur de la propriété mtech.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtech(Double value) {
        this.mtech = value;
    }

    /**
     * Gets the value of the paliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcsTAPaliersDto }
     * 
     * 
     */
    public List<LcsTAPaliersDto> getPaliers() {
        if (paliers == null) {
            paliers = new ArrayList<LcsTAPaliersDto>();
        }
        return this.paliers;
    }

    /**
     * Obtient la valeur de la propriété taea.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaea() {
        return taea;
    }

    /**
     * Définit la valeur de la propriété taea.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaea(Double value) {
        this.taea = value;
    }

    /**
     * Obtient la valeur de la propriété teg.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeg() {
        return teg;
    }

    /**
     * Définit la valeur de la propriété teg.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeg(Double value) {
        this.teg = value;
    }

    /**
     * Obtient la valeur de la propriété totaccc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotaccc() {
        return totaccc;
    }

    /**
     * Définit la valeur de la propriété totaccc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotaccc(Double value) {
        this.totaccc = value;
    }

    /**
     * Obtient la valeur de la propriété totassc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotassc() {
        return totassc;
    }

    /**
     * Définit la valeur de la propriété totassc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotassc(Double value) {
        this.totassc = value;
    }

    /**
     * Obtient la valeur de la propriété totassc2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotassc2() {
        return totassc2;
    }

    /**
     * Définit la valeur de la propriété totassc2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotassc2(Double value) {
        this.totassc2 = value;
    }

    /**
     * Obtient la valeur de la propriété totintc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotintc() {
        return totintc;
    }

    /**
     * Définit la valeur de la propriété totintc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotintc(Double value) {
        this.totintc = value;
    }

    /**
     * Obtient la valeur de la propriété totmech.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotmech() {
        return totmech;
    }

    /**
     * Définit la valeur de la propriété totmech.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotmech(Double value) {
        this.totmech = value;
    }

}
