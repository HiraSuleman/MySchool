package com.example.teachandtest;

import java.util.List;

public class TeachersModel {
    String name;
    String department;
    List<String> subjects;
    int age;
    String gender;
    String teacherId;
    String qualification;
    String cnic;
public TeachersModel(){

}
    public TeachersModel(String name, String department, List<String> subjects ,int age, String gender, String teacherId,String qualification,String cnic) {
        this.name = name;
        this.department = department;
        this.subjects=subjects;
        this.age = age;
        this.gender = gender;
        this.teacherId=teacherId;
        this.qualification=qualification;
        this.cnic=cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) { this.department = department;}
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(String age) {
        this.subjects = subjects;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}




