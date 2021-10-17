package com.example.StudentCrud.controller;


import com.example.StudentCrud.domain.Teacher;
import com.example.StudentCrud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    //save user
    @PostMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return this.service.saveTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable (value = "id") long teacherId){
        return this.service.getTeacherById(teacherId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Teacher> deleteTeacher(@PathVariable (value="id") long teacherId){
        return this.service.deleteTeacher(teacherId);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable (value="id") long teacherId){
        return this.service.updateTeacher(teacher,teacherId);
    }
}
