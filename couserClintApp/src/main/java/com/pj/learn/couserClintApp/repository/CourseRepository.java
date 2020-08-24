package com.pj.learn.couserClintApp.repository;

import com.pj.learn.couserClintApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
