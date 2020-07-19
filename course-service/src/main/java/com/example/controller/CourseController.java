package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@CrossOrigin(origins = {"http://54.214.120.99:3000"})

public class CourseController {
//api for enrolling user
	@GetMapping("getAwsCourseSyllabus")
	public List<String> getAwsCourseSyllabus() {
		return Arrays.asList("ec2", "elasticbeanstalk", "lambda", "amazon s3", "amazon galcier");

	}

	@GetMapping("getDevopsCourseSyllabus")
	public List<String> getDevopsCourseSyllabus() {
		return Arrays.asList("git", "apache maven", "apache tomcat", "docker", "kubernetes");

	}

}
