package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {
//api for enrolling user
	@PostMapping("enrollUser")
	public String enrollUser(@RequestBody User user) {
		System.out.println("enroll User" + user);
		return "User enrolled successfully";

	}

	// updateuserInformation
	@PutMapping("updateuserInformation")
	public String updateuserInformation(@RequestBody User updateuserInformation) {
		System.out.println("enroll User" + updateuserInformation);
		return "User updated successfully";

	}

	@DeleteMapping("deletUser")
	public String deletUser(@RequestBody User deletUser) {
		System.out.println("deletUser User" + deletUser);
		return "User deleted successfully";

	}

	@GetMapping("getAllUsers")
	public List<User> getAllUsers() {
		User user1 = new User("vamsikrm", "vamsikrm123", "vamsitechtuts@gmail.com", "marthahalli");
		return Arrays.asList(user1);

	}
}
