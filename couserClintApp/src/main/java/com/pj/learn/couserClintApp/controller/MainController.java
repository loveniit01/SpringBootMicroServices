package com.pj.learn.couserClintApp.controller;

import com.pj.learn.couserClintApp.model.Course;
import com.pj.learn.couserClintApp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
@Autowired
CourseRepository courseRepository;
@GetMapping("/")
    public String getCourseAppHome()
    {
        return "Course App Home";
    }

    @GetMapping("/course")
    public List<Course> getCourses()
    {
        return courseRepository.findAll();
    }
}
