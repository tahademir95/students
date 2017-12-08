package com.taha.model;

public class Student {

    private String ad;
    private String soyad;
    private String password;
    private String gender;
    private Double gpa;

    public Student(String ad, String soyad, String password, String gender, Double gpa) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.gender = gender;
        this.gpa = gpa;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
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
    public Double studentGPA(){
        return gpa;
    }
}
