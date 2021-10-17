package com.example.StudentCrud.service;

import com.example.StudentCrud.domain.Course;
import com.example.StudentCrud.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> getAll(){
        return this.repo.findAll();
    }

    public Course createCourse(Course crs){
        return this.repo.save(crs);
    }

    public Course getCourseById(long id){
        return this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Course not found by this id"+id));
    }

    public ResponseEntity<Course> deleteById(long id){
        Course existingCrs=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Course not found by this id"+id));
        this.repo.delete(existingCrs);
        return ResponseEntity.ok().build();
    }

    public Course updateCourse(Course crs,long id){
        Course existingCrs=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Course not found by this id"+id));
        existingCrs.setName(crs.getName());
        existingCrs.setNumber_of_student(crs.getNumber_of_student());
        return this.repo.save(existingCrs);
    }

}
