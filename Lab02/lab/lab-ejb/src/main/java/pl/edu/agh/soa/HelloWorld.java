package pl.edu.agh.soa;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class HelloWorld {
    @WebMethod
    public String hello(@WebParam(name = "name") String name){
        return "Hello " + name;
    }
}
