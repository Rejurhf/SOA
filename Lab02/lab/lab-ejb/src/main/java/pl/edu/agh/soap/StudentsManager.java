package pl.edu.agh.soap;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;
import pl.edu.agh.soa2.Student;

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

@WebService
@Stateless
@DeclareRoles({"admin", "other"})
@WebContext(authMethod="BASIC", transportGuarantee="NONE")
@SecurityDomain("other")
public class StudentsManager {
    private List<StudentInstance> students = new ArrayList<>();
    private String srcToImage = "D:\\Documents\\Studia\\SOA\\SOA\\Lab02\\lab\\lab-ejb\\src\\main\\resources\\agh.png";

    public StudentsManager() {
        List<String> subjectsA = new ArrayList<>();
        subjectsA.add("math");
        subjectsA.add("code");
        subjectsA.add("english");
        students.add(new StudentInstance("Andrzej", "Telep", 1, 666, subjectsA));

        List<String> subjectsB = new ArrayList<>();
        subjectsB.add("history");
        subjectsB.add("physics");
        subjectsB.add("philosophy");
        subjectsB.add("logic");
        students.add(new StudentInstance("Krzysztof", "Nowak", 2, 777, subjectsB));

        List<String> subjectsC = new ArrayList<>();
        subjectsC.add("pe");
        subjectsC.add("soa");
        students.add(new StudentInstance("Anna", "Kowalska", 3, 888, subjectsC));
    }

    @WebMethod(action = "getLastNameOf")
    @PermitAll
    @XmlElement(name="Element")
    public String getNameOf(int id){
        for(StudentInstance student : students)
            if(student.getId() == id)
                return student.getName();

        return "No such student";
    }

    @WebMethod(action = "getLastNameOf")
    @PermitAll
    @XmlElement(name="Element")
    public String getLastNameOf(int id){
        for(StudentInstance student : students)
            if(student.getId() == id)
                return student.getLastName();

        return "No such student";
    }

    private String getInfo(StudentInstance student){
        StringBuilder info = new StringBuilder("Name: " + student.getName() + "\nLast Name: " + student.getLastName() +
                "\nYear: " + student.getYear() + "\nSubjects: ");
        for(String subject : student.getSubjects()){
            info.append(subject + ", ");
        }
        return info.toString();
    }

    @WebMethod(action = "getInfoAbout")
    @RolesAllowed("admin")
    @XmlElement(name="Element")
    public String getInfoAbout(int id) {
        for (StudentInstance student : students){
            if (student.getId() == id) {
                return getInfo(student);
            }
        }
        return "No such student";
    }

    @WebMethod(action = "getSubjectsOf")
    @PermitAll
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List<String> getSubjectsOf(int id){
        for(StudentInstance student : students)
            if(student.getId() == id)
                return student.getSubjects();

        return new ArrayList<>();
    }

    @WebMethod(action = "getAllStudents")
    @PermitAll
    @XmlElementWrapper(name="ElementsWraper")
    @XmlElement(name="Element")
    public List<StudentInstance> getAllStudents(){
        return students;
    }

    @WebMethod(action = "getAllStudentsInfo")
    @PermitAll
    @XmlElement(name="Element")
    public String getAllStudentsInfo(){
        StringBuilder info = new StringBuilder();
        for(StudentInstance student : students) {
            info.append(this.getInfo(student));
            info.append("\n\n--------\n\n");
        }

        return info.toString();
    }

    @WebMethod(action = "addStudent")
    @PermitAll
    public void addStudent(@WebParam(name = "name")String name, @WebParam(name = "lastName")String lastName,
                           @WebParam(name = "year")int year, @WebParam(name = "id")int id,
                           @WebParam(name = "subjects")List<String> subjects){
        students.add(new StudentInstance(name, lastName, year, id, subjects));
    }

    @WebMethod(action = "addSubjectTo")
    @PermitAll
    public void addSubjectTo(int id, String subject){
        for(StudentInstance student : students)
            if(student.getId() == id) {
                student.addSubject(subject);
            }
    }

    @WebMethod(action = "editLastNameOf")
    @PermitAll
    public void editLastNameOf(int id, String newLastName){
        for(StudentInstance student : students)
            if(student.getId() == id) {
                student.setLastName(newLastName);
            }
    }

    @WebMethod(action = "encodeImage")
    @PermitAll
    public String getEncodeAvatarOf(int id){
        String base64Image = "";
        File file = new File(srcToImage);
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
