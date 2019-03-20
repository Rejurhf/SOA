package pl.edu.agh.soa;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;


@WebService
@Stateless
@DeclareRoles({"developer"})
@WebContext(authMethod = "BASIC",transportGuarantee = "NONE")
@SecurityDomain("testdomeny")
public class HelloWorld {
//    @WebMethod
//    public String hello(@WebParam(name = "name") String name){
//        return "Hello " + name;
//    }

//    @WebMethod
//    @RolesAllowed("abc")
//    @XmlElementWrapper(name="ElementsWraper")
//    @XmlElement(name="Element")
//    public List Hi(@WebParam(name = "name")String name){
//        List<String> list = new ArrayList<>();
//        list.add("Hello " + name);
//        list.add("Cześć " + name);
//        list.add("Guten Tag " + name);
//
//        return list;
//    }

    @WebMethod(action = "Hello")
    @WebResult(name = "getHello")
    @RolesAllowed("developer")
    public String hello(@WebParam(name = "name") String name){
        return "Hello " + name;
    }


}
