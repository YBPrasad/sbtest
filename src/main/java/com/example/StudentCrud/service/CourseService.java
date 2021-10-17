package com.example.StudentCrud.service;

import com.example.StudentCrud.domain.Course;
import com.example.StudentCrud.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
