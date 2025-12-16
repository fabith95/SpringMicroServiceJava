package com.microservice.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.courses.entities.Course;
import com.microservice.courses.persistence.ICourseRepository;

@Service
public class CourseService implements ICourseService {

    @Autowired
    public ICourseRepository courseRepository;

    @Override
    public List<Course> findAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

}
