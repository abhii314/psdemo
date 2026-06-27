package com.mru.psdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mru.psdemo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
    Student findByEmail(String email);

    Student findByName(String name);
    
    @Query("SELECT s FROM Student s WHERE s.city = :city")
    List<Student> getStudentsByCity( @Param("city") String city);
}
