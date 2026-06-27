package com.mru.psdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getStuEmail/{email}")
    Student getStudentByEmail(@PathVariable String email){
        return studentService.getStudentByEmail(email);
    }

    @GetMapping("/getStuName/{name}")
    Student getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }
    @GetMapping("/getStuByCity/{city}")
    List<Student> getStudentByCity(@PathVariable String city){
        return studentService.getStudentByCity(city);
    }

    @GetMapping("/getSortListStu/{sortBy}")
    List<Student> getStudentBySorting(@PathVariable String sortBy){
        return studentService.getStudentSortList(sortBy);
    }

    @GetMapping("/getStuPage")
    public Page<Student> getStudents( @RequestParam int page, @RequestParam int size) {


    return studentService.getStudentsPage(page,size);
    }

}
