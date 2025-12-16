package com.microservice.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.students.entities.Student;
import com.microservice.students.persistence.StudentRepository;

@Service
public class StudentServiceImple implements IStudentService{


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>)studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return (List<Student>)studentRepository.findByIdCourse(idCourse);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);        
    }
    
}
