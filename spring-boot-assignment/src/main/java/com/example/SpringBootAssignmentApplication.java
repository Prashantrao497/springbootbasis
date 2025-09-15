package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.auto.Student;
import com.example.auto1.Restarent;

@SpringBootApplication
public class SpringBootAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}
	
	
	private Student student;

	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	@Autowired
private Restarent restarent; 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		student.showCourse("frontend").forEach(System.out::println);
		student.showCourse("backend").forEach(System.out::println);
		student.showCourse("cloud").forEach(System.out::println);
	
//	System.out.println();
//	restarent.DisplayMenu();
		
		   restarent.DisplayMenu("chinism");
		    restarent.DisplayMenu("indian");
		    restarent.DisplayMenu("italy");
		
		
	}

}
