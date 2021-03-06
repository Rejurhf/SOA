package pl.edu.agh.soa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-04-04T22:00:32.937+02:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://soa.agh.edu.pl/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod(operationName = "Hi")
    @RequestWrapper(localName = "Hi", targetNamespace = "http://soa.agh.edu.pl/", className = "pl.edu.agh.soa.Hi")
    @ResponseWrapper(localName = "HiResponse", targetNamespace = "http://soa.agh.edu.pl/", className = "pl.edu.agh.soa.HiResponse")
    @WebResult(name = "ElementsWraper", targetNamespace = "")
    public pl.edu.agh.soa.HiResponse.ElementsWraper hi(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebMethod(action = "Hello")
    @RequestWrapper(localName = "hello", targetNamespace = "http://soa.agh.edu.pl/", className = "pl.edu.agh.soa.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://soa.agh.edu.pl/", className = "pl.edu.agh.soa.HelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String hello(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}
