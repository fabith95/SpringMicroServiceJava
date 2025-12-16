package com.microservice.students.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.students.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    @Query("SELECT s FROM Student s WHERE s.idCourse = :idCourse")
    List<Student> findByIdCourse(Long idCourse);

    // List<Student> findStudentById(Long idCourse);
}
