package com.mru.psdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.psdemo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
    
}
