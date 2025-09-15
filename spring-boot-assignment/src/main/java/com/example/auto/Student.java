package com.example.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class Student {
	//autobytype
	@Autowired
	@Qualifier("frontend") //class name in lower case,inside it is bean na,e
private Icourse course;
	
	
//	auto by name
	@Autowired
private Icourse backend;
	
	//aoto by consturor
	
private Icourse cloud;

public Student(@Qualifier("cloudComputing")Icourse cloud) {
	super();
	this.cloud = cloud;
}




public List<String> showCourse(String choise){
	if(choise.equals("frontend"))
		return course.getAllCourses();
	if(choise.equals("backend"))
		return backend.getAllCourses();
	if(choise.equals("cloud"))
		return cloud.getAllCourses();
	return null;
}
}
