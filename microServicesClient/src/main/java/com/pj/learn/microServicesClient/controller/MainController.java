package com.pj.learn.microServicesClient.controller;

import com.pj.learn.microServicesClient.model.Users;
import com.pj.learn.microServicesClient.repository.CourseRepository;
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

    @GetMapping("/users")
    public List<Users> getCourses()
    {
        return courseRepository.findAll();
    }
}
