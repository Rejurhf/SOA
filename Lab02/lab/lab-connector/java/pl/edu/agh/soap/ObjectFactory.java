
package pl.edu.agh.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.agh.soap package. 
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

    private final static QName _AddStudent_QNAME = new QName("http://soap.agh.edu.pl/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://soap.agh.edu.pl/", "addStudentResponse");
    private final static QName _AddSubjectTo_QNAME = new QName("http://soap.agh.edu.pl/", "addSubjectTo");
    private final static QName _AddSubjectToResponse_QNAME = new QName("http://soap.agh.edu.pl/", "addSubjectToResponse");
    private final static QName _EditLastNameOf_QNAME = new QName("http://soap.agh.edu.pl/", "editLastNameOf");
    private final static QName _EditLastNameOfResponse_QNAME = new QName("http://soap.agh.edu.pl/", "editLastNameOfResponse");
    private final static QName _GetAllStudents_QNAME = new QName("http://soap.agh.edu.pl/", "getAllStudents");
    private final static QName _GetAllStudentsInfo_QNAME = new QName("http://soap.agh.edu.pl/", "getAllStudentsInfo");
    private final static QName _GetAllStudentsInfoResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getAllStudentsInfoResponse");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getAllStudentsResponse");
    private final static QName _GetEncodeAvatarOf_QNAME = new QName("http://soap.agh.edu.pl/", "getEncodeAvatarOf");
    private final static QName _GetEncodeAvatarOfResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getEncodeAvatarOfResponse");
    private final static QName _GetInfoAbout_QNAME = new QName("http://soap.agh.edu.pl/", "getInfoAbout");
    private final static QName _GetInfoAboutResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getInfoAboutResponse");
    private final static QName _GetLastNameOf_QNAME = new QName("http://soap.agh.edu.pl/", "getLastNameOf");
    private final static QName _GetLastNameOfResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getLastNameOfResponse");
    private final static QName _GetNameOf_QNAME = new QName("http://soap.agh.edu.pl/", "getNameOf");
    private final static QName _GetNameOfResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getNameOfResponse");
    private final static QName _GetSubjectsOf_QNAME = new QName("http://soap.agh.edu.pl/", "getSubjectsOf");
    private final static QName _GetSubjectsOfResponse_QNAME = new QName("http://soap.agh.edu.pl/", "getSubjectsOfResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.agh.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubjectsOfResponse }
     * 
     */
    public GetSubjectsOfResponse createGetSubjectsOfResponse() {
        return new GetSubjectsOfResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     * 
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link AddSubjectTo }
     * 
     */
    public AddSubjectTo createAddSubjectTo() {
        return new AddSubjectTo();
    }

    /**
     * Create an instance of {@link AddSubjectToResponse }
     * 
     */
    public AddSubjectToResponse createAddSubjectToResponse() {
        return new AddSubjectToResponse();
    }

    /**
     * Create an instance of {@link EditLastNameOf }
     * 
     */
    public EditLastNameOf createEditLastNameOf() {
        return new EditLastNameOf();
    }

    /**
     * Create an instance of {@link EditLastNameOfResponse }
     * 
     */
    public EditLastNameOfResponse createEditLastNameOfResponse() {
        return new EditLastNameOfResponse();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     * 
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetAllStudentsInfo }
     * 
     */
    public GetAllStudentsInfo createGetAllStudentsInfo() {
        return new GetAllStudentsInfo();
    }

    /**
     * Create an instance of {@link GetAllStudentsInfoResponse }
     * 
     */
    public GetAllStudentsInfoResponse createGetAllStudentsInfoResponse() {
        return new GetAllStudentsInfoResponse();
    }

    /**
     * Create an instance of {@link GetEncodeAvatarOf }
     * 
     */
    public GetEncodeAvatarOf createGetEncodeAvatarOf() {
        return new GetEncodeAvatarOf();
    }

    /**
     * Create an instance of {@link GetEncodeAvatarOfResponse }
     * 
     */
    public GetEncodeAvatarOfResponse createGetEncodeAvatarOfResponse() {
        return new GetEncodeAvatarOfResponse();
    }

    /**
     * Create an instance of {@link GetInfoAbout }
     * 
     */
    public GetInfoAbout createGetInfoAbout() {
        return new GetInfoAbout();
    }

    /**
     * Create an instance of {@link GetInfoAboutResponse }
     * 
     */
    public GetInfoAboutResponse createGetInfoAboutResponse() {
        return new GetInfoAboutResponse();
    }

    /**
     * Create an instance of {@link GetLastNameOf }
     * 
     */
    public GetLastNameOf createGetLastNameOf() {
        return new GetLastNameOf();
    }

    /**
     * Create an instance of {@link GetLastNameOfResponse }
     * 
     */
    public GetLastNameOfResponse createGetLastNameOfResponse() {
        return new GetLastNameOfResponse();
    }

    /**
     * Create an instance of {@link GetNameOf }
     * 
     */
    public GetNameOf createGetNameOf() {
        return new GetNameOf();
    }

    /**
     * Create an instance of {@link GetNameOfResponse }
     * 
     */
    public GetNameOfResponse createGetNameOfResponse() {
        return new GetNameOfResponse();
    }

    /**
     * Create an instance of {@link GetSubjectsOf }
     * 
     */
    public GetSubjectsOf createGetSubjectsOf() {
        return new GetSubjectsOf();
    }

    /**
     * Create an instance of {@link StudentInstance }
     * 
     */
    public StudentInstance createStudentInstance() {
        return new StudentInstance();
    }

    /**
     * Create an instance of {@link GetSubjectsOfResponse.ElementsWraper }
     * 
     */
    public GetSubjectsOfResponse.ElementsWraper createGetSubjectsOfResponseElementsWraper() {
        return new GetSubjectsOfResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse.ElementsWraper }
     * 
     */
    public GetAllStudentsResponse.ElementsWraper createGetAllStudentsResponseElementsWraper() {
        return new GetAllStudentsResponse.ElementsWraper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubjectTo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubjectTo }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "addSubjectTo")
    public JAXBElement<AddSubjectTo> createAddSubjectTo(AddSubjectTo value) {
        return new JAXBElement<AddSubjectTo>(_AddSubjectTo_QNAME, AddSubjectTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubjectToResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubjectToResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "addSubjectToResponse")
    public JAXBElement<AddSubjectToResponse> createAddSubjectToResponse(AddSubjectToResponse value) {
        return new JAXBElement<AddSubjectToResponse>(_AddSubjectToResponse_QNAME, AddSubjectToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditLastNameOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditLastNameOf }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "editLastNameOf")
    public JAXBElement<EditLastNameOf> createEditLastNameOf(EditLastNameOf value) {
        return new JAXBElement<EditLastNameOf>(_EditLastNameOf_QNAME, EditLastNameOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditLastNameOfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditLastNameOfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "editLastNameOfResponse")
    public JAXBElement<EditLastNameOfResponse> createEditLastNameOfResponse(EditLastNameOfResponse value) {
        return new JAXBElement<EditLastNameOfResponse>(_EditLastNameOfResponse_QNAME, EditLastNameOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudentsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getAllStudentsInfo")
    public JAXBElement<GetAllStudentsInfo> createGetAllStudentsInfo(GetAllStudentsInfo value) {
        return new JAXBElement<GetAllStudentsInfo>(_GetAllStudentsInfo_QNAME, GetAllStudentsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudentsInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getAllStudentsInfoResponse")
    public JAXBElement<GetAllStudentsInfoResponse> createGetAllStudentsInfoResponse(GetAllStudentsInfoResponse value) {
        return new JAXBElement<GetAllStudentsInfoResponse>(_GetAllStudentsInfoResponse_QNAME, GetAllStudentsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEncodeAvatarOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEncodeAvatarOf }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getEncodeAvatarOf")
    public JAXBElement<GetEncodeAvatarOf> createGetEncodeAvatarOf(GetEncodeAvatarOf value) {
        return new JAXBElement<GetEncodeAvatarOf>(_GetEncodeAvatarOf_QNAME, GetEncodeAvatarOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEncodeAvatarOfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEncodeAvatarOfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getEncodeAvatarOfResponse")
    public JAXBElement<GetEncodeAvatarOfResponse> createGetEncodeAvatarOfResponse(GetEncodeAvatarOfResponse value) {
        return new JAXBElement<GetEncodeAvatarOfResponse>(_GetEncodeAvatarOfResponse_QNAME, GetEncodeAvatarOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoAbout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoAbout }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getInfoAbout")
    public JAXBElement<GetInfoAbout> createGetInfoAbout(GetInfoAbout value) {
        return new JAXBElement<GetInfoAbout>(_GetInfoAbout_QNAME, GetInfoAbout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoAboutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoAboutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getInfoAboutResponse")
    public JAXBElement<GetInfoAboutResponse> createGetInfoAboutResponse(GetInfoAboutResponse value) {
        return new JAXBElement<GetInfoAboutResponse>(_GetInfoAboutResponse_QNAME, GetInfoAboutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastNameOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastNameOf }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getLastNameOf")
    public JAXBElement<GetLastNameOf> createGetLastNameOf(GetLastNameOf value) {
        return new JAXBElement<GetLastNameOf>(_GetLastNameOf_QNAME, GetLastNameOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastNameOfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLastNameOfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getLastNameOfResponse")
    public JAXBElement<GetLastNameOfResponse> createGetLastNameOfResponse(GetLastNameOfResponse value) {
        return new JAXBElement<GetLastNameOfResponse>(_GetLastNameOfResponse_QNAME, GetLastNameOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameOf }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getNameOf")
    public JAXBElement<GetNameOf> createGetNameOf(GetNameOf value) {
        return new JAXBElement<GetNameOf>(_GetNameOf_QNAME, GetNameOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameOfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameOfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getNameOfResponse")
    public JAXBElement<GetNameOfResponse> createGetNameOfResponse(GetNameOfResponse value) {
        return new JAXBElement<GetNameOfResponse>(_GetNameOfResponse_QNAME, GetNameOfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubjectsOf }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getSubjectsOf")
    public JAXBElement<GetSubjectsOf> createGetSubjectsOf(GetSubjectsOf value) {
        return new JAXBElement<GetSubjectsOf>(_GetSubjectsOf_QNAME, GetSubjectsOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsOfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubjectsOfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.agh.edu.pl/", name = "getSubjectsOfResponse")
    public JAXBElement<GetSubjectsOfResponse> createGetSubjectsOfResponse(GetSubjectsOfResponse value) {
        return new JAXBElement<GetSubjectsOfResponse>(_GetSubjectsOfResponse_QNAME, GetSubjectsOfResponse.class, null, value);
    }

}
