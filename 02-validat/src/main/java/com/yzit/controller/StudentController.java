package com.yzit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yzit.entity.Student;

@RestController
public class StudentController {

	@PostMapping("/stu")
	public String add(@RequestBody @Valid Student stu,BindingResult result) {
		StringBuffer errorMsg = new StringBuffer();
		if(result.hasErrors()) {//如果有错误信息
			List<ObjectError> errList = result.getAllErrors();//获取错误信息
			for (ObjectError error : errList) {
				System.out.println(error.getDefaultMessage()); //打印错误信息
				errorMsg.append(error.getDefaultMessage()+"<br>");
			}
		}
		if(errorMsg.length() > 0) { //错误信息大于0 说明有错误
			return errorMsg.toString();
		}
		return "成功";
	}
}
