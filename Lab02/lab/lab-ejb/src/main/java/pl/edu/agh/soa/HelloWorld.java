package pl.edu.agh.soa;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
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
@DeclareRoles({"developer", "other"})
@RolesAllowed("user6")
@WebContext(urlPattern="/*", authMethod="BASIC", transportGuarantee="NONE")
@SecurityDomain("other")
public class HelloWorld {

    @WebMethod
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    @PermitAll
    public List Hi(@WebParam(name = "name")String name){
        List<String> list = new ArrayList<>();
        list.add("Hello " + name);
        list.add("Cześć " + name);
        list.add("Guten Tag " + name);

        return list;
    }

    @WebMethod(action = "Hello")
//    @WebResult(name = "getHello")
    @RolesAllowed("developer")
    public String hello(@WebParam(name = "name") String name){
        return "Hello " + name;
    }
}
