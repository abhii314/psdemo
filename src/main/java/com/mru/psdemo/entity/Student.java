package com.mru.psdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


   private String name;
   private String email;
   private Integer age;
   private String city;


   // Getters and Setters
}

