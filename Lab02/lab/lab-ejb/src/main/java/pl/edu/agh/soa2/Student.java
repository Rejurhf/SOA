package pl.edu.agh.soa2;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@WebService
@Stateless
@DeclareRoles({"admin", "other"})
@WebContext(authMethod="BASIC", transportGuarantee="NONE")
@SecurityDomain("other")
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
    @RolesAllowed("admin")
    @XmlElement(name="Element")
    public String hello(@WebParam(name = "name") String name){
        return "Hello student " + name + ", it's " + this.name;
    }
    
    @WebMethod(action = "getSubjects")
    @PermitAll
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List getSubjects(){
        return subjects;
    }

    @WebMethod(action = "addSubject")
    @PermitAll
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List addSubject(@WebParam(name = "subject")String subject){
        subjects.add(subject);
        return subjects;
    }

    @WebMethod(action = "addSubject")
    @PermitAll
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
    @PermitAll
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

    @WebMethod(action = "encodeImage")
    @PermitAll
    public String encodeImage(@WebParam(name = "fileName")String fileName) {
        String base64Image = "";
        File file = new File(fileName);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a Image file from file system
            byte imageData[] = new byte[(int) file.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
        if(base64Image.isEmpty())
            return "No image";
        return base64Image;
    }
}
