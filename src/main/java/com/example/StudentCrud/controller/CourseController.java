package com.example.StudentCrud.controller;



import com.example.StudentCrud.domain.Course;
import com.example.StudentCrud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping
    public Course saveCourse(@RequestBody Course crs){
        return this.service.createCourse(crs);
    }

    @GetMapping
    public List<Course> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable (value="id") long crsId){
        return this.service.getCourseById(crsId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Course> deleteCourse(@PathVariable (value="id") long crsId){
        return this.service.deleteById(crsId);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@RequestBody Course crs,@PathVariable (value="id") long crsId){
        return this.service.updateCourse(crs,crsId);
    }
}
