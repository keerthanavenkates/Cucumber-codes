package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	static WebDriver driver;
	
	public void Browserlaunch() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
	}
	
	public void Launchurl() {
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	
	public static void draganddrop(WebElement Source , WebElement target) {
		
		Actions a = new Actions(driver);
			a.dragAndDrop(Source,target).build().perform();
		}	
	
	public static void pause(int milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}
	
	public static void assertText(Integer num1 ,Integer num2 ){
	
	Assert.assertEquals("num1","num2");
		}
	
	public void mouseover(WebElement ele){
	Actions clicker = new Actions(driver);
	clicker.moveToElement(ele).build().perform();
	
	}
		
	public void scrollDown(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);	
		
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");

	}
	
	private void insertText(WebElement ele ,String value ) {
		ele.sendKeys(value,Keys.ENTER);
		
	}

}
