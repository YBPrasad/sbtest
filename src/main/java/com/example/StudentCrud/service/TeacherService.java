package com.example.StudentCrud.service;

import com.example.StudentCrud.domain.Teacher;
import com.example.StudentCrud.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repo;

    public Teacher saveTeacher(Teacher teacher){
        return this.repo.save(teacher);
    }

    public List<Teacher> getAll(){
        return this.repo.findAll();
    }

    public Teacher getTeacherById(long id){
        return this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Teacher can't find this id "+id));
    }

    public ResponseEntity<Teacher> deleteTeacher(long id){
        Teacher existingTeacher=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Teacher can't find this id "+id));
        this.repo.delete(existingTeacher);
        return ResponseEntity.ok().build();
    }

    public Teacher updateTeacher(Teacher teacher,long id){
        Teacher existingTeacher=this.repo.findById(id).orElseThrow(()->new ResourceAccessException("Teacher can't find this id "+id));
        existingTeacher.setTeacher_name(teacher.getTeacher_name());
        existingTeacher.setCourse(teacher.getCourse());
        return this.repo.save(existingTeacher);
    }

}
