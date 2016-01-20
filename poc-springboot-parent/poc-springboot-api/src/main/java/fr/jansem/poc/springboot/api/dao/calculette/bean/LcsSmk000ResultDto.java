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
 * <p>Classe Java pour lcsSmk000ResultDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lcsSmk000ResultDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errors" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}errorMessageDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lcsSmk000DataOutDto" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsSmk000DataOutDto" minOccurs="0"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lcsSmk000ResultDto", propOrder = {
    "errors",
    "lcsSmk000DataOutDto",
    "returnCode"
})
public class LcsSmk000ResultDto {

    @XmlElement(nillable = true)
    protected List<ErrorMessageDto> errors;
    protected LcsSmk000DataOutDto lcsSmk000DataOutDto;
    protected String returnCode;

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageDto }
     * 
     * 
     */
    public List<ErrorMessageDto> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorMessageDto>();
        }
        return this.errors;
    }

    /**
     * Obtient la valeur de la propriété lcsSmk000DataOutDto.
     * 
     * @return
     *     possible object is
     *     {@link LcsSmk000DataOutDto }
     *     
     */
    public LcsSmk000DataOutDto getLcsSmk000DataOutDto() {
        return lcsSmk000DataOutDto;
    }

    /**
     * Définit la valeur de la propriété lcsSmk000DataOutDto.
     * 
     * @param value
     *     allowed object is
     *     {@link LcsSmk000DataOutDto }
     *     
     */
    public void setLcsSmk000DataOutDto(LcsSmk000DataOutDto value) {
        this.lcsSmk000DataOutDto = value;
    }

    /**
     * Obtient la valeur de la propriété returnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Définit la valeur de la propriété returnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}
