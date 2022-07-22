package com.flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario(){
		System.out.println("Before scenario");
	}
	
	
	@After
	public void afterScenario(){
		System.out.println("Before scenario");
	}
	
	
}

//Execution order
//Before
//background
//scenario
//After