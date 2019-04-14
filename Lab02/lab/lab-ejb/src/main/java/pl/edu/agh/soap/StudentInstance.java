package pl.edu.agh.soap;

import java.util.ArrayList;
import java.util.List;

public class StudentInstance {
    private List<String> subjects = new ArrayList<>();
    private String name;
    private String lastName;
    private int year;
    private int id;

    public StudentInstance() {
        this.name = "Jan";
        this.lastName = "Kowalski";
        this.year = 1;
        this.subjects.add("math");
        this.subjects.add("code");
        this.subjects.add("math2");
        this.id = 0;
    }

    public StudentInstance(String name, String lastName, int year, int id, List<String> subjects){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.id = id;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addSubject(String subject) {
        this.subjects.add(subject);
    }
}
