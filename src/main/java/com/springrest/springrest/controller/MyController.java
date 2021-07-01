package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springrest.springrest.service.CourseService;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return  "this is my app";
    }


    @GetMapping("/courses")
        public List<Course> getCourse(){
        return this.courseService.getCourse();

    }

    @GetMapping("/courses/{courseId}")
    public Course getSingleCourse(@PathVariable String courseId){
        return this.courseService.getSingleCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
        this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}
