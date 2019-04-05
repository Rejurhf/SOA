
package pl.edu.agh.soa2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.agh.soa2 package. 
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

    private final static QName _AddSubject_QNAME = new QName("http://soa2.agh.edu.pl/", "addSubject");
    private final static QName _AddSubjectResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "addSubjectResponse");
    private final static QName _EditSubject_QNAME = new QName("http://soa2.agh.edu.pl/", "editSubject");
    private final static QName _EditSubjectResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "editSubjectResponse");
    private final static QName _EncodeImage_QNAME = new QName("http://soa2.agh.edu.pl/", "encodeImage");
    private final static QName _EncodeImageResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "encodeImageResponse");
    private final static QName _FilterSubjectsContaining_QNAME = new QName("http://soa2.agh.edu.pl/", "filterSubjectsContaining");
    private final static QName _FilterSubjectsContainingResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "filterSubjectsContainingResponse");
    private final static QName _GetSubjects_QNAME = new QName("http://soa2.agh.edu.pl/", "getSubjects");
    private final static QName _GetSubjectsResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "getSubjectsResponse");
    private final static QName _Hello_QNAME = new QName("http://soa2.agh.edu.pl/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://soa2.agh.edu.pl/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.agh.soa2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubjectsResponse }
     * 
     */
    public GetSubjectsResponse createGetSubjectsResponse() {
        return new GetSubjectsResponse();
    }

    /**
     * Create an instance of {@link FilterSubjectsContainingResponse }
     * 
     */
    public FilterSubjectsContainingResponse createFilterSubjectsContainingResponse() {
        return new FilterSubjectsContainingResponse();
    }

    /**
     * Create an instance of {@link EditSubjectResponse }
     * 
     */
    public EditSubjectResponse createEditSubjectResponse() {
        return new EditSubjectResponse();
    }

    /**
     * Create an instance of {@link AddSubjectResponse }
     * 
     */
    public AddSubjectResponse createAddSubjectResponse() {
        return new AddSubjectResponse();
    }

    /**
     * Create an instance of {@link AddSubject }
     * 
     */
    public AddSubject createAddSubject() {
        return new AddSubject();
    }

    /**
     * Create an instance of {@link EditSubject }
     * 
     */
    public EditSubject createEditSubject() {
        return new EditSubject();
    }

    /**
     * Create an instance of {@link EncodeImage }
     * 
     */
    public EncodeImage createEncodeImage() {
        return new EncodeImage();
    }

    /**
     * Create an instance of {@link EncodeImageResponse }
     * 
     */
    public EncodeImageResponse createEncodeImageResponse() {
        return new EncodeImageResponse();
    }

    /**
     * Create an instance of {@link FilterSubjectsContaining }
     * 
     */
    public FilterSubjectsContaining createFilterSubjectsContaining() {
        return new FilterSubjectsContaining();
    }

    /**
     * Create an instance of {@link GetSubjects }
     * 
     */
    public GetSubjects createGetSubjects() {
        return new GetSubjects();
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
     * Create an instance of {@link GetSubjectsResponse.ElementsWraper }
     * 
     */
    public GetSubjectsResponse.ElementsWraper createGetSubjectsResponseElementsWraper() {
        return new GetSubjectsResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link FilterSubjectsContainingResponse.ElementsWraper }
     * 
     */
    public FilterSubjectsContainingResponse.ElementsWraper createFilterSubjectsContainingResponseElementsWraper() {
        return new FilterSubjectsContainingResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link EditSubjectResponse.ElementsWraper }
     * 
     */
    public EditSubjectResponse.ElementsWraper createEditSubjectResponseElementsWraper() {
        return new EditSubjectResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link AddSubjectResponse.ElementsWraper }
     * 
     */
    public AddSubjectResponse.ElementsWraper createAddSubjectResponseElementsWraper() {
        return new AddSubjectResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "addSubject")
    public JAXBElement<AddSubject> createAddSubject(AddSubject value) {
        return new JAXBElement<AddSubject>(_AddSubject_QNAME, AddSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubjectResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubjectResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "addSubjectResponse")
    public JAXBElement<AddSubjectResponse> createAddSubjectResponse(AddSubjectResponse value) {
        return new JAXBElement<AddSubjectResponse>(_AddSubjectResponse_QNAME, AddSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditSubject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditSubject }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "editSubject")
    public JAXBElement<EditSubject> createEditSubject(EditSubject value) {
        return new JAXBElement<EditSubject>(_EditSubject_QNAME, EditSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditSubjectResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditSubjectResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "editSubjectResponse")
    public JAXBElement<EditSubjectResponse> createEditSubjectResponse(EditSubjectResponse value) {
        return new JAXBElement<EditSubjectResponse>(_EditSubjectResponse_QNAME, EditSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeImage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncodeImage }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "encodeImage")
    public JAXBElement<EncodeImage> createEncodeImage(EncodeImage value) {
        return new JAXBElement<EncodeImage>(_EncodeImage_QNAME, EncodeImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeImageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncodeImageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "encodeImageResponse")
    public JAXBElement<EncodeImageResponse> createEncodeImageResponse(EncodeImageResponse value) {
        return new JAXBElement<EncodeImageResponse>(_EncodeImageResponse_QNAME, EncodeImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterSubjectsContaining }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterSubjectsContaining }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "filterSubjectsContaining")
    public JAXBElement<FilterSubjectsContaining> createFilterSubjectsContaining(FilterSubjectsContaining value) {
        return new JAXBElement<FilterSubjectsContaining>(_FilterSubjectsContaining_QNAME, FilterSubjectsContaining.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterSubjectsContainingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterSubjectsContainingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "filterSubjectsContainingResponse")
    public JAXBElement<FilterSubjectsContainingResponse> createFilterSubjectsContainingResponse(FilterSubjectsContainingResponse value) {
        return new JAXBElement<FilterSubjectsContainingResponse>(_FilterSubjectsContainingResponse_QNAME, FilterSubjectsContainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "getSubjects")
    public JAXBElement<GetSubjects> createGetSubjects(GetSubjects value) {
        return new JAXBElement<GetSubjects>(_GetSubjects_QNAME, GetSubjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubjectsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "getSubjectsResponse")
    public JAXBElement<GetSubjectsResponse> createGetSubjectsResponse(GetSubjectsResponse value) {
        return new JAXBElement<GetSubjectsResponse>(_GetSubjectsResponse_QNAME, GetSubjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "hello")
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
    @XmlElementDecl(namespace = "http://soa2.agh.edu.pl/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
