package com.example.StudentCrud.domain;

import javax.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="teacher_name")
    private String teacher_name;
    @Column(name="course")
    private String course;

    public Teacher(Long id, String teacher_name, String course) {
        this.id = id;
        this.teacher_name = teacher_name;
        this.course = course;
    }

    public Teacher() {

    }

    public Long getId() {
        return id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
