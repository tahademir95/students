package com.taha.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class StudentInfo implements Serializable{

    public String ad;
    public String soyad;
    public String password;
    public String gender;

    public Integer gpa;

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String addNewStudent(){

        boolean added = true;
        FacesMessage doneMessage = null;
        String outcome = null;
        if (added) {
            doneMessage = new FacesMessage("Successfully added new student");
            outcome = "response";
        } else {
            doneMessage = new FacesMessage("Failed to add new student");
            outcome = "register";
        }
        FacesContext.getCurrentInstance().addMessage(null, doneMessage);
        return outcome;
    }
    public String studentName(){
        return ad;
    }
    public String studentSurname(){
        return soyad;
    }
    public String studentPassword(){
        return password;
    }
    public String studentGender(){
        return gender;
    }
    public Integer studentGPA(){
        return gpa;
    }



}
