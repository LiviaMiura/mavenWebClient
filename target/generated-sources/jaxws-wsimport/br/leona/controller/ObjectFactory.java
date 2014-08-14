
package br.leona.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.leona.controller package. 
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

    private final static QName _GetListServiceResponse_QNAME = new QName("http://controller.station.leona.br/", "GetListServiceResponse");
    private final static QName _GetListService_QNAME = new QName("http://controller.station.leona.br/", "GetListService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.leona.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListService }
     * 
     */
    public GetListService createGetListService() {
        return new GetListService();
    }

    /**
     * Create an instance of {@link GetListServiceResponse }
     * 
     */
    public GetListServiceResponse createGetListServiceResponse() {
        return new GetListServiceResponse();
    }

    /**
     * Create an instance of {@link Servico }
     * 
     */
    public Servico createServico() {
        return new Servico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListServiceResponse")
    public JAXBElement<GetListServiceResponse> createGetListServiceResponse(GetListServiceResponse value) {
        return new JAXBElement<GetListServiceResponse>(_GetListServiceResponse_QNAME, GetListServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListService")
    public JAXBElement<GetListService> createGetListService(GetListService value) {
        return new JAXBElement<GetListService>(_GetListService_QNAME, GetListService.class, null, value);
    }

}
