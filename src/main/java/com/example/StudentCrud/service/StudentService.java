package com.example.StudentCrud.service;


import com.example.StudentCrud.domain.Student;

import com.example.StudentCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll(){

        return this.repo.findAll();
    }

    public Student save(Student std){

        return this.repo.save(std);
    }

    public Student getUserById(long id){

        return this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Student not found with this id "+id));
    }
    public ResponseEntity<Student> delete(long id){
        Student existingStudent=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Student not found with this id "+id));
        this.repo.delete(existingStudent);
        return ResponseEntity.ok().build();
    }

    public Student updateStudent(Student std,long id){
        Student existingStudent=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Student not found with this id "+id));
        existingStudent.setStudentName(std.getStudentName());
        existingStudent.setCourse(std.getCourse());
        existingStudent.setFee(std.getFee());
        return this.repo.save(existingStudent);
    }
}
