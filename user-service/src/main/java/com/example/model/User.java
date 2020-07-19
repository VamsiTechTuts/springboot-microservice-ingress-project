package com.example.model;

public class User {
private String username;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String username, String password, String email, String address) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.address = address;
}
private String password;
private String email;
private String address;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", email=" + email + ", address=" + address + "]";
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
