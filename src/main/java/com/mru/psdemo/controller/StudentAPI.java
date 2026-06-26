package com.mru.psdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.psdemo.entity.Student;
import com.mru.psdemo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentAPI {
    

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    Student creaStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @GetMapping("/get")
    List<Student> getStudentsList(){
        return studentService.getStudentsList();
    }

    @GetMapping("/get/{id}")
    Student getStudent(@PathVariable long id){
        return studentService.getStudent(id);
    }
}
