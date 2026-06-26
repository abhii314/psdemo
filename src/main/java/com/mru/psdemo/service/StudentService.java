package com.mru.psdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.psdemo.entity.Student;
import com.mru.psdemo.repository.StudentRepo;

@Service
public class StudentService {
    

    @Autowired
    StudentRepo studentRepo;

    public Student createStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getStudentsList(){
        return studentRepo.findAll();
    }

    public Student getStudent(long id){
        return studentRepo.getReferenceById(id);
    }
}
