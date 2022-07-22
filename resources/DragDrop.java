package com.flipkart.resources;


	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class DragDrop extends CommonActions  {
		
CommonActions c = new CommonActions();
@Given("To lauch browser")
public void to_lauch_browser() {
	
	c.Browserlaunch();
	
}

@Given("To launch url")
public void to_launch_url() {
	
	c.Launchurl();
	
}
	@When("Find web elements")
	public static void find_web_elements() {

	
   
}



	@When("Drag and drop source{int} and target{int}")
	public void drag_and_drop_source_and_target(Integer int1, Integer int2) throws Exception{ 
	


	WebElement Source1 =  driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement target1 =  driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
	

	WebElement Source2 =  driver.findElement(By.xpath("//a[text()=' 5000 ']"));	
	WebElement target2 =  driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	

	
	WebElement Source3 =  driver.findElement(By.xpath("//a[text()=' SALES ']"));	
	WebElement target3 =  driver.findElement(By.xpath("(//ol[@align='center'])[3]"));

	WebElement Source4 =  driver.findElement(By.xpath("//a[text()=' 5000']"));	
	WebElement target4 =  driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
	

	
	
		CommonActions.pause(1000);
		CommonActions.draganddrop(Source1, target1);
		CommonActions.draganddrop(Source2, target2);	
		CommonActions.draganddrop(Source3, target3);
		CommonActions.draganddrop(Source4, target4);
		CommonActions.pause(1000);
	}


@When("get text in credit movement")
public void get_text_in_credit_movement() {
	

	WebElement debitmovement =  driver.findElement(By.id("t7"));
	
	String num1 =	debitmovement.getText();
	System.out.println("Debit Movement" +num1);
	
}

@When("get text in debit movement")
public void get_text_in_debit_movement() {
	WebElement creditmovement =  driver.findElement(By.id("t8"));
	String num2 =	creditmovement.getText();
	System.out.println("Credit Movement" +num2);
   
}

@Then("Check text {int} and text {int} are equal or not")
public void check_text_and_text_are_equal_or_not(Integer num1, Integer num2) {
	
	
CommonActions.assertText(num1, num2);
    
}

@Then("Move to perfect")
public void move_to_perfect() {
	
	WebElement ele =  driver.findElement(By.xpath("//a[text()='Perfect!']"));
	c.mouseover(ele);
    
}





}


