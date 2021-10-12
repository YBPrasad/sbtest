package com.example.StudentCrud.domain;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="studentName")
    private String studentName;

    @Column(name="course")
    private String course;

    @Column(name="fee")
    private int fee;

    public Student(){

    }

    public Student(Long id, String studentName, String course, int fee) {
        this.id = id;
        this.studentName = studentName;
        this.course = course;
        this.fee = fee;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public int getFee() {
        return fee;
    }

    public Long getId() {
        return id;
    }
}
