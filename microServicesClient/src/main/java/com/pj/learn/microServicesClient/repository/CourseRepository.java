package com.pj.learn.microServicesClient.repository;

import com.pj.learn.microServicesClient.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepository extends JpaRepository<Users, BigInteger> {

}
