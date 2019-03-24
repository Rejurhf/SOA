package pl.edu.agh.soa2;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class Student {
    @WebMethod(action = "Hello")
    public String hello(@WebParam(name = "name") String name){
        return "Hello " + name + " student student";
    }
}
