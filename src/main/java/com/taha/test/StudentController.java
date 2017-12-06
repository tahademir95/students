package com.taha.test;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "test")
public class StudentController {

    List<Student> liste = new ArrayList<Student>();


    @PostConstruct
    public void init(){
        liste.add(new Student("taha","demir"));
        liste.add(new Student("sercan","yektas"));
        liste.add(new Student("fatih", "gülsoy"));
        liste.add(new Student("aslı", "karacan"));


    }


    public List<Student> getListe() {
        return liste;
    }

    public void setListe(List<Student> liste) {
        this.liste = liste;
    }
}