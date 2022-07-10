package com.project.StudenRecordProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer ID;
    private String first_name;
    private String last_name;
    private String contactNumber;

    public Student(){

    }
    public Student(Integer ID, String first_name, String last_name, String contactNumber) {
        this.ID = ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.contactNumber = contactNumber;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
