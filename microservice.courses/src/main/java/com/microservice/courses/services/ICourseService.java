package com.microservice.courses.services;

import java.util.List;

import com.microservice.courses.entities.Course;

public interface ICourseService {

    public List<Course> findAllCourses();

    public Course findCourseById(Long id);

    public void save(Course course);
}
