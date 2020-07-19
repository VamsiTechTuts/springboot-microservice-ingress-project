package com.example.model;

public class CourseToUser {
	private String coursename;

	public CourseToUser(String coursename, String username, String email) {
		super();
		this.coursename = coursename;
		this.username = username;
		this.email = email;
	}

	public CourseToUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCoursename() {
		return coursename;
	}

	@Override
	public String toString() {
		return "CourseToUser [coursename=" + coursename + ", username=" + username + ", email=" + email + "]";
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String username;
	private String email;
}
