package com.microservice.courses.persistence;

import org.springframework.data.repository.CrudRepository;

import com.microservice.courses.entities.Course;

public interface ICourseRepository extends CrudRepository<Course, Long>{

}
