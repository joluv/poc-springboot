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
 * <p>Classe Java pour lcsSmk000DataOutDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsSmk000DataOutDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cout_total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="duree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lcsTABDto" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsTABDto" minOccurs="0"/&gt;
 *         &lt;element name="mtinter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ta" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsTADto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="teg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total_acc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total_ass" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total_ass_taea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="txint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsSmk000DataOutDto", propOrder = {
    "coutTotal",
    "duree",
    "lcsTABDto",
    "mtinter",
    "nominal",
    "ta",
    "taea",
    "teg",
    "totalAcc",
    "totalAss",
    "totalAssTaea",
    "txint"
})
public class LcsSmk000DataOutDto {

    @XmlElement(name = "cout_total")
    protected Double coutTotal;
    protected Integer duree;
    protected LcsTABDto lcsTABDto;
    protected Double mtinter;
    protected Double nominal;
    @XmlElement(nillable = true)
    protected List<LcsTADto> ta;
    protected Double taea;
    protected Double teg;
    @XmlElement(name = "total_acc")
    protected Double totalAcc;
    @XmlElement(name = "total_ass")
    protected Double totalAss;
    @XmlElement(name = "total_ass_taea")
    protected Double totalAssTaea;
    protected Double txint;

    /**
     * Obtient la valeur de la propriété coutTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoutTotal() {
        return coutTotal;
    }

    /**
     * Définit la valeur de la propriété coutTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoutTotal(Double value) {
        this.coutTotal = value;
    }

    /**
     * Obtient la valeur de la propriété duree.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuree() {
        return duree;
    }

    /**
     * Définit la valeur de la propriété duree.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuree(Integer value) {
        this.duree = value;
    }

    /**
     * Obtient la valeur de la propriété lcsTABDto.
     * 
     * @return
     *     possible object is
     *     {@link LcsTABDto }
     *     
     */
    public LcsTABDto getLcsTABDto() {
        return lcsTABDto;
    }

    /**
     * Définit la valeur de la propriété lcsTABDto.
     * 
     * @param value
     *     allowed object is
     *     {@link LcsTABDto }
     *     
     */
    public void setLcsTABDto(LcsTABDto value) {
        this.lcsTABDto = value;
    }

    /**
     * Obtient la valeur de la propriété mtinter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMtinter() {
        return mtinter;
    }

    /**
     * Définit la valeur de la propriété mtinter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMtinter(Double value) {
        this.mtinter = value;
    }

    /**
     * Obtient la valeur de la propriété nominal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominal() {
        return nominal;
    }

    /**
     * Définit la valeur de la propriété nominal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominal(Double value) {
        this.nominal = value;
    }

    /**
     * Gets the value of the ta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LcsTADto }
     * 
     * 
     */
    public List<LcsTADto> getTa() {
        if (ta == null) {
            ta = new ArrayList<LcsTADto>();
        }
        return this.ta;
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
     * Obtient la valeur de la propriété totalAcc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAcc() {
        return totalAcc;
    }

    /**
     * Définit la valeur de la propriété totalAcc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAcc(Double value) {
        this.totalAcc = value;
    }

    /**
     * Obtient la valeur de la propriété totalAss.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAss() {
        return totalAss;
    }

    /**
     * Définit la valeur de la propriété totalAss.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAss(Double value) {
        this.totalAss = value;
    }

    /**
     * Obtient la valeur de la propriété totalAssTaea.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAssTaea() {
        return totalAssTaea;
    }

    /**
     * Définit la valeur de la propriété totalAssTaea.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAssTaea(Double value) {
        this.totalAssTaea = value;
    }

    /**
     * Obtient la valeur de la propriété txint.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTxint() {
        return txint;
    }

    /**
     * Définit la valeur de la propriété txint.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTxint(Double value) {
        this.txint = value;
    }

}
