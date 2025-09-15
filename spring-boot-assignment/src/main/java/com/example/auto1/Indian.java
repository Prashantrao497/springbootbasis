package com.example.auto1;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements Imenu {

	@Override
	public List<String> itemAvl() {
		// TODO Auto-generated method stub
		return List.of("magi","charante","nudals");
	}

}
