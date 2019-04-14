package pl.edu.agh.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-04-14T21:11:28.714+02:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://soap.agh.edu.pl/", name = "StudentsManager")
@XmlSeeAlso({ObjectFactory.class})
public interface StudentsManager {

    @WebMethod(action = "getLastNameOf")
    @RequestWrapper(localName = "getLastNameOf", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetLastNameOf")
    @ResponseWrapper(localName = "getLastNameOfResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetLastNameOfResponse")
    @WebResult(name = "Element", targetNamespace = "")
    public java.lang.String getLastNameOf(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "getAllStudents")
    @RequestWrapper(localName = "getAllStudents", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetAllStudents")
    @ResponseWrapper(localName = "getAllStudentsResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetAllStudentsResponse")
    @WebResult(name = "ElementsWraper", targetNamespace = "")
    public pl.edu.agh.soap.GetAllStudentsResponse.ElementsWraper getAllStudents();

    @WebMethod(action = "addSubjectTo")
    @RequestWrapper(localName = "addSubjectTo", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.AddSubjectTo")
    @ResponseWrapper(localName = "addSubjectToResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.AddSubjectToResponse")
    public void addSubjectTo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod(action = "editLastNameOf")
    @RequestWrapper(localName = "editLastNameOf", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.EditLastNameOf")
    @ResponseWrapper(localName = "editLastNameOfResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.EditLastNameOfResponse")
    public void editLastNameOf(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod(action = "addStudent")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.AddStudentResponse")
    public void addStudent(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "lastName", targetNamespace = "")
        java.lang.String lastName,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "subjects", targetNamespace = "")
        java.util.List<java.lang.String> subjects
    );

    @WebMethod(action = "getAllStudentsInfo")
    @RequestWrapper(localName = "getAllStudentsInfo", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetAllStudentsInfo")
    @ResponseWrapper(localName = "getAllStudentsInfoResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetAllStudentsInfoResponse")
    @WebResult(name = "Element", targetNamespace = "")
    public java.lang.String getAllStudentsInfo();

    @WebMethod(action = "getInfoAbout")
    @RequestWrapper(localName = "getInfoAbout", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetInfoAbout")
    @ResponseWrapper(localName = "getInfoAboutResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetInfoAboutResponse")
    @WebResult(name = "Element", targetNamespace = "")
    public java.lang.String getInfoAbout(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "getLastNameOf")
    @RequestWrapper(localName = "getNameOf", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetNameOf")
    @ResponseWrapper(localName = "getNameOfResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetNameOfResponse")
    @WebResult(name = "Element", targetNamespace = "")
    public java.lang.String getNameOf(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "encodeImage")
    @RequestWrapper(localName = "getEncodeAvatarOf", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetEncodeAvatarOf")
    @ResponseWrapper(localName = "getEncodeAvatarOfResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetEncodeAvatarOfResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getEncodeAvatarOf(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "getSubjectsOf")
    @RequestWrapper(localName = "getSubjectsOf", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetSubjectsOf")
    @ResponseWrapper(localName = "getSubjectsOfResponse", targetNamespace = "http://soap.agh.edu.pl/", className = "pl.edu.agh.soap.GetSubjectsOfResponse")
    @WebResult(name = "ElementsWraper", targetNamespace = "")
    public pl.edu.agh.soap.GetSubjectsOfResponse.ElementsWraper getSubjectsOf(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
