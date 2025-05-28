package org.example.OrganizingData.UnidirectionalAssociationToBidirectional;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String tittle;
    private List<Student> students;

    public Course(String tittle) {
        this.tittle = tittle;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
