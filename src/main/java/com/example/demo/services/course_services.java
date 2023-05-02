package com.example.demo.services;

import com.example.demo.entities.Course;

import java.util.List;

public interface course_services {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
}
