
package pl.edu.agh.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.agh.soa package. 
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

    private final static QName _Hi_QNAME = new QName("http://soa.agh.edu.pl/", "Hi");
    private final static QName _HiResponse_QNAME = new QName("http://soa.agh.edu.pl/", "HiResponse");
    private final static QName _Hello_QNAME = new QName("http://soa.agh.edu.pl/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://soa.agh.edu.pl/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.agh.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HiResponse }
     * 
     */
    public HiResponse createHiResponse() {
        return new HiResponse();
    }

    /**
     * Create an instance of {@link Hi }
     * 
     */
    public Hi createHi() {
        return new Hi();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link HiResponse.ElementsWraper }
     * 
     */
    public HiResponse.ElementsWraper createHiResponseElementsWraper() {
        return new HiResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hi }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa.agh.edu.pl/", name = "Hi")
    public JAXBElement<Hi> createHi(Hi value) {
        return new JAXBElement<Hi>(_Hi_QNAME, Hi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa.agh.edu.pl/", name = "HiResponse")
    public JAXBElement<HiResponse> createHiResponse(HiResponse value) {
        return new JAXBElement<HiResponse>(_HiResponse_QNAME, HiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa.agh.edu.pl/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa.agh.edu.pl/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
