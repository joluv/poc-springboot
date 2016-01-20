//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.20 à 11:33:20 AM CET 
//


package fr.jansem.poc.springboot.api.dao.calculette.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Classe Java pour callSmk000 complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType name="callSmk000"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}serviceSessionDto" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/}lcsSmk000DataInDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callSmk000", propOrder = {
    "arg0",
    "arg1"
})
@XmlRootElement(name = "callSmk000")
public class CallSmk000 {

    protected ServiceSessionDto arg0;
    protected LcsSmk000DataInDto arg1;

    /**
	 * Obtient la valeur de la propriété arg0.
	 * 
	 * @return possible object is {@link ServiceSessionDto }
	 * 
	 */
    public ServiceSessionDto getArg0() {
        return arg0;
    }

    /**
	 * Définit la valeur de la propriété arg0.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceSessionDto }
	 * 
	 */
    public void setArg0(ServiceSessionDto value) {
        this.arg0 = value;
    }

    /**
	 * Obtient la valeur de la propriété arg1.
	 * 
	 * @return possible object is {@link LcsSmk000DataInDto }
	 * 
	 */
    public LcsSmk000DataInDto getArg1() {
        return arg1;
    }

    /**
	 * Définit la valeur de la propriété arg1.
	 * 
	 * @param value
	 *            allowed object is {@link LcsSmk000DataInDto }
	 * 
	 */
    public void setArg1(LcsSmk000DataInDto value) {
        this.arg1 = value;
    }

}
