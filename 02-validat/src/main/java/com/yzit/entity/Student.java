package com.yzit.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class Student {
	
	@NotNull(message="名字不能为空")
	private String userName;
	@Max(value=120,message="年龄最大不能查过120")
	private int age;
	@Email(message="邮箱格式错误")
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
