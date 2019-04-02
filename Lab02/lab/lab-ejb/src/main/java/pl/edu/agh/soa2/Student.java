package pl.edu.agh.soa2;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebService
@Stateless
public class Student {
    private List<String> subjects = new ArrayList<>();
    private String name;
    private String lastName;
    private int year;

    public Student() {
        this.name = "Jan";
        this.lastName = "Kowalski";
        this.year = 1;
        this.subjects.add("math");
        this.subjects.add("code");
        this.subjects.add("math2");
    }

    public Student(String imie, String nazwisko, int rok){
        this.name = imie;
        this.lastName = nazwisko;
        this.year = rok;
    }

    @WebMethod(action = "Hello")
    public String hello(@WebParam(name = "name") String name){
        return "Hello student " + name + ", it's " + this.name;
    }
    
    @WebMethod(action = "getSubjects")
    public List getSubjects(){
        return subjects;
    }

    @WebMethod(action = "addSubject")
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List addSubject(@WebParam(name = "subject")String subject){
        subjects.add(subject);
        return subjects;
    }

    @WebMethod(action = "addSubject")
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List filterSubjectsContaining(@WebParam(name = "filter")String filter){
        if(filter.length() < 1)
            return subjects;
        else
            return subjects.stream()
                    .filter(s -> s.contains(filter))
                    .collect(Collectors.toList());
    }

    @WebMethod(action = "addSubject")
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List editSubject(@WebParam(name = "filter")String filter, @WebParam(name = "value")String value,
                            @WebParam(name = "operation")int operation){

        // 0 - repleace, else append
        int tmpIndex = subjects.indexOf(filter);
        if(value.length() < 1 || tmpIndex == -1)
            return subjects;
        else if(operation == 0){
            subjects.set(tmpIndex, value);
        } else{
            subjects.set(tmpIndex, subjects.get(tmpIndex) + value);
        }
        return subjects;
    }
}
