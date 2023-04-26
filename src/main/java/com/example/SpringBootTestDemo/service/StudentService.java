package com.example.SpringBootTestDemo.service;

import com.example.SpringBootTestDemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudent();



    List<Student> getStudentByName(String name);

    Student deleteStudentById(Integer id);

    Student getStudentById(Integer id);
}
