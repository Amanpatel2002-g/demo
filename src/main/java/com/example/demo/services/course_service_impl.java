package com.example.demo.services;

import com.example.demo.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class course_service_impl implements  course_services{
    List<Course>list;
    public course_service_impl(){
        list = new ArrayList<>();
        list.add(new Course(445, "Course1", "This is the course1 desc"));
        list.add(new Course(455, "Course2", "This is the course2 desc"));
        list.add(new Course(465, "Course3", "This is the course3 desc"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course _course = null;
        for(Course course:list){
            if(course.getId()==courseId){
                 System.out.println("This is the getCourse function");
                _course = course;
                break;

            }
        }
        return _course;
    }
}
