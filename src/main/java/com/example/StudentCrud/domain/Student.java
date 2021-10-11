package com.example.StudentCrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentname;
    private String course;
    private int fee;

    public Student(){

    }

    public Student(Long id, String studentname, String course, int fee) {
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.fee = fee;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getCourse() {
        return course;
    }

    public int getFee() {
        return fee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
