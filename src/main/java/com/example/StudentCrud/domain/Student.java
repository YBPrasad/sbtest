package com.example.StudentCrud.domain;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="student_name")
    private String student_name;

    @Column(name="course")
    private String course;

    @Column(name="fee")
    private int fee;

    public Student(){

    }

    public Student(Long id, String studentName, String course, int fee) {
        this.id = id;
        this.student_name = studentName;
        this.course = course;
        this.fee = fee;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
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

    public String getStudent_name() {
        return student_name;
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
