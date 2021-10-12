package com.example.StudentCrud.controller;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    //get all students
    @GetMapping
    public List<Student> getAll(){
        return this.service.listAll();
    }
    //get student by id
    @GetMapping("/{id}")
    public Student getUser(@PathVariable (value="id") long studentID){
        return this.service.getUserById(studentID);
    }
    //save student
    @PostMapping
    public Student saveUser(@RequestBody Student std){
        return this.service.save(std);
    }
    //update student
    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student std,@PathVariable (value="id") long userId){
        return this.service.updateStudent(std,userId);
    }
    //delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable (value="id") long userId){
        return this.service.delete(userId);
    }

}
