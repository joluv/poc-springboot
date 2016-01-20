//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.20 à 11:33:20 AM CET 
//


package fr.jansem.poc.springboot.api.dao.calculette.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.jansem.poc.springboot.api.dao.calculette.bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallSmk000_QNAME = new QName("http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/", "callSmk000");
    private final static QName _CallSmk000Response_QNAME = new QName("http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/", "callSmk000Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.jansem.poc.springboot.api.dao.calculette.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorMessageDto }
     * 
     */
    public ErrorMessageDto createErrorMessageDto() {
        return new ErrorMessageDto();
    }

    /**
     * Create an instance of {@link ErrorMessageDto.ErrorData }
     * 
     */
    public ErrorMessageDto.ErrorData createErrorMessageDtoErrorData() {
        return new ErrorMessageDto.ErrorData();
    }

    /**
     * Create an instance of {@link ServiceSessionDto }
     * 
     */
    public ServiceSessionDto createServiceSessionDto() {
        return new ServiceSessionDto();
    }

    /**
     * Create an instance of {@link ServiceSessionDto.AttributeList }
     * 
     */
    public ServiceSessionDto.AttributeList createServiceSessionDtoAttributeList() {
        return new ServiceSessionDto.AttributeList();
    }

    /**
     * Create an instance of {@link CallSmk000 }
     * 
     */
    public CallSmk000 createCallSmk000() {
        return new CallSmk000();
    }

    /**
     * Create an instance of {@link CallSmk000Response }
     * 
     */
    public CallSmk000Response createCallSmk000Response() {
        return new CallSmk000Response();
    }

    /**
     * Create an instance of {@link LcsSmk000DataInDto }
     * 
     */
    public LcsSmk000DataInDto createLcsSmk000DataInDto() {
        return new LcsSmk000DataInDto();
    }

    /**
     * Create an instance of {@link LcsDaccpDto }
     * 
     */
    public LcsDaccpDto createLcsDaccpDto() {
        return new LcsDaccpDto();
    }

    /**
     * Create an instance of {@link LcsDasspDto }
     * 
     */
    public LcsDasspDto createLcsDasspDto() {
        return new LcsDasspDto();
    }

    /**
     * Create an instance of {@link LcsDpalamnnDto }
     * 
     */
    public LcsDpalamnnDto createLcsDpalamnnDto() {
        return new LcsDpalamnnDto();
    }

    /**
     * Create an instance of {@link LcsDpalfrDto }
     * 
     */
    public LcsDpalfrDto createLcsDpalfrDto() {
        return new LcsDpalfrDto();
    }

    /**
     * Create an instance of {@link LcsSmk000ResultDto }
     * 
     */
    public LcsSmk000ResultDto createLcsSmk000ResultDto() {
        return new LcsSmk000ResultDto();
    }

    /**
     * Create an instance of {@link LcsSmk000DataOutDto }
     * 
     */
    public LcsSmk000DataOutDto createLcsSmk000DataOutDto() {
        return new LcsSmk000DataOutDto();
    }

    /**
     * Create an instance of {@link LcsTABDto }
     * 
     */
    public LcsTABDto createLcsTABDto() {
        return new LcsTABDto();
    }

    /**
     * Create an instance of {@link LcsTAPaliersDto }
     * 
     */
    public LcsTAPaliersDto createLcsTAPaliersDto() {
        return new LcsTAPaliersDto();
    }

    /**
     * Create an instance of {@link LcsTADto }
     * 
     */
    public LcsTADto createLcsTADto() {
        return new LcsTADto();
    }

    /**
     * Create an instance of {@link ErrorMessageDto.ErrorData.Entry }
     * 
     */
    public ErrorMessageDto.ErrorData.Entry createErrorMessageDtoErrorDataEntry() {
        return new ErrorMessageDto.ErrorData.Entry();
    }

    /**
     * Create an instance of {@link ServiceSessionDto.AttributeList.Entry }
     * 
     */
    public ServiceSessionDto.AttributeList.Entry createServiceSessionDtoAttributeListEntry() {
        return new ServiceSessionDto.AttributeList.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallSmk000 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/", name = "callSmk000")
    public JAXBElement<CallSmk000> createCallSmk000(CallSmk000 value) {
        return new JAXBElement<CallSmk000>(_CallSmk000_QNAME, CallSmk000 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallSmk000Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loancalculation.published.v1_3_0.financialplan.ws.xchannel.xc.sopra.com/", name = "callSmk000Response")
    public JAXBElement<CallSmk000Response> createCallSmk000Response(CallSmk000Response value) {
        return new JAXBElement<CallSmk000Response>(_CallSmk000Response_QNAME, CallSmk000Response.class, null, value);
    }

}
