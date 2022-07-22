package com.flipkart.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TvPurchaseSteps {
	
	@When("user search Tv")
	public void user_search_Tv() {
		MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys("samsung",Keys.ENTER);
		
		WebElement Mobilename2 = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG')])[2]"));
		String fn = Mobilename2.getText();
		System.out.println(Mobilename2.getText());
	}

}