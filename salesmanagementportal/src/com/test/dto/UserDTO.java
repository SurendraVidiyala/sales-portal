package com.test.dto;

public class UserDTO {
	int userId;
	String username;
	String email;
	int userType;
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", username=" + username
				+ ", email=" + email + ", userType=" + userType + ", name="
				+ name + ", password=" + password + "]";
	}
	String name;
	String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
