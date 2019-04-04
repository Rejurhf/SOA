package pl.edu.agh.soa;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;


@WebService
@Stateless
public class HelloWorld {

    @WebMethod
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List Hi(@WebParam(name = "name")String name){
        List<String> list = new ArrayList<>();
        list.add("Hello " + name);
        list.add("Cześć " + name);
        list.add("Guten Tag " + name);

        return list;
    }

    @WebMethod(action = "Hello")
    public String hello(@WebParam(name = "name") String name){
        return "Hello " + name;
    }
}
