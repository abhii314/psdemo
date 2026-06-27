package com.mru.psdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Student getStudentByEmail(String email){
        return studentRepo.findByEmail(email);
    }

    public Student getStudentByName(String name){
        return studentRepo.findByName(name);
    }

    public List<Student> getStudentByCity(String city){
        return studentRepo.getStudentsByCity(city);
    }


    public List<Student> getStudentSortList(String sortBy){
        return studentRepo.findAll(Sort.by(sortBy));
    }

    public Page<Student> getStudentsPage(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);
        return studentRepo.findAll(pageable);
    }
}
