package com.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps {
	
	static long start;
	public static WebDriver driver;
	
	@Given("user launches flipkart Application")
	public void user_launches_flipkart_Application() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	   
	}

	@Given("user login in to flipkart")
	public void user_login_in_to_flipkart() {
		System.out.println("login");
		WebElement Closeicon =  driver.findElement(By.xpath("//button[text()='✕']"));
		Closeicon.click();
	}

	@When("user search mobile")
	public void user_search_mobile() {
		WebElement Searchbar =  driver.findElement(By.name("q"));
		Searchbar.sendKeys("samsung",Keys.ENTER);
		
		WebElement Mobilename2 = driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG')])[2]"));
		String fn = Mobilename2.getText();
		System.out.println(Mobilename2.getText());
}	 
		
			
	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() {
		
		Assert.assertEquals("BUY NOW","BUY NOW");
	}

	@When("user search mobile	by using one dim list")
	public void user_search_mobile_by_using_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws Exception {

		Actions a = new Actions(driver);
		List<String>asList = dataTable.asList();
	  WebElement Searchbar =  driver.findElement(By.name("q"));
		Searchbar.sendKeys(asList.get(0),Keys.ENTER);	
		Thread.sleep(3000);

		WebElement move =  driver.findElement(By.xpath("//img[@alt='Flipkart']"));
		a.moveToElement(move).build().perform();

		
		WebElement Mobilename = driver.findElement(By.xpath("(//div[contains(text(),'"+asList.get(0)+"')])[2]"));
		String fn = Mobilename.getText();
		System.out.println(Mobilename.getText());
		Mobilename.click();
	}
	
	@When("user search mobile	by using one dim map")
	public void user_search_mobile_by_using_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws Exception {
		Actions a = new Actions(driver);
		Map<String, String>asMap = dataTable.asMap(String.class,String.class);
		 WebElement Searchbar =  driver.findElement(By.name("q"));
			Searchbar.sendKeys(asMap.get("phone1"),Keys.ENTER);	
			
			Thread.sleep(3000);

			WebElement move =  driver.findElement(By.xpath("//img[@alt='Flipkart']"));
			a.moveToElement(move).build().perform();

			WebElement Mobilename = driver.findElement(By.xpath("(//div[contains(text(),'"+asMap.get("phone1")+"')])[2]"));
			String fn = Mobilename.getText();
			System.out.println(Mobilename.getText());
			Mobilename.click();

	}
	@When("user search mobile	{string}")
	public void user_search_mobile(String names) throws Exception {
		Actions a = new Actions(driver);
		 WebElement Searchbar =  driver.findElement(By.name("q"));
			Searchbar.sendKeys(names,Keys.ENTER);	
			
			Thread.sleep(3000);

			WebElement move =  driver.findElement(By.xpath("//img[@alt='Flipkart']"));
			a.moveToElement(move).build().perform();
			
			Thread.sleep(3000);
			WebElement Mobilename2 = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
			String fn = Mobilename2.getText();
			System.out.println(Mobilename2.getText());
			Mobilename2.click();
		

	    
	}

	
		}







