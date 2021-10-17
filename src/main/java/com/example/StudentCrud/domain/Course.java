package com.example.StudentCrud.domain;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String number_of_student;

    public Course(Long id, String name, String number_of_student) {
        this.id = id;
        this.name = name;
        this.number_of_student = number_of_student;
    }

    public Course() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber_of_student(String number_of_student) {
        this.number_of_student = number_of_student;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber_of_student() {
        return number_of_student;
    }
}
