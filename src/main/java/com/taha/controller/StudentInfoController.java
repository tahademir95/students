package com.taha.controller;


import com.taha.model.Student;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "studentPostData")
public class StudentInfoController {

    List<Student> studentList = new ArrayList<Student>();

    @PostConstruct
    public void init() {
        studentList.add(new Student("Taha","Demir", "qdlksjş123", "e", 3.20));
        studentList.add(new Student("Fatih","Balkan", "hjdlka51", "e", 3.40));
        studentList.add(new Student("Fatma","Demir", "ddksjaş", "k", 3.50));

    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
