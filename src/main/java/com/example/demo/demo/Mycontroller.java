package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Course;
import  com.example.demo.services.course_services;
import java.util.List;

@RestController
public class Mycontroller {
    @Autowired
    private course_services courseServices;
    @GetMapping("/home")
    public  String home(){
        return "This is home";
    }
    // Now creating the coursees get api
    @GetMapping("/courses")
    public  List<Course>getCourses(){
        return courseServices.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String  courseId){
        return this.courseServices.getCourse(Long.parseLong(courseId));
    }
}
