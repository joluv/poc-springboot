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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Classe Java pour callSmk000Response complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType name="callSmk000Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsSmk000ResultDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callSmk000Response", propOrder = {
    "_return"
})
@XmlRootElement(name = "callSmk000Response")
public class CallSmk000Response {

    @XmlElement(name = "return")
    protected LcsSmk000ResultDto _return;

    /**
	 * Obtient la valeur de la propriété return.
	 * 
	 * @return possible object is {@link LcsSmk000ResultDto }
	 * 
	 */
    public LcsSmk000ResultDto getReturn() {
        return _return;
    }

    /**
	 * Définit la valeur de la propriété return.
	 * 
	 * @param value
	 *            allowed object is {@link LcsSmk000ResultDto }
	 * 
	 */
    public void setReturn(LcsSmk000ResultDto value) {
        this._return = value;
    }

}
