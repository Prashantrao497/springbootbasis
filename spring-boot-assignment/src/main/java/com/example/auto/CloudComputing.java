package com.example.auto;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component("cloudComputing")
public class CloudComputing implements Icourse {

	@Override
	
	public List<String> getAllCourses() {
		// TODO Auto-generated method stub
		return Arrays.asList("aws","azure","zscala");
	}

}
