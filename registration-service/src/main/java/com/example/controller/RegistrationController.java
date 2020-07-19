package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseToUser;

@RestController
public class RegistrationController {
//api for enrolling user
	@PostMapping("enrollForCourse")
	public String enrollForCourse(@RequestBody CourseToUser courseToUser) {
		System.out.println("CourseToUser " + courseToUser);
		return "User enrolled course successfully";

	}

}
