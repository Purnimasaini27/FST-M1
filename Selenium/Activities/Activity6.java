package com.example.FST_Selenium_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	        // Create the Actions object
	        Actions builder = new Actions(driver);

	        // Open the page
	        driver.get("https://v1.training-support.net/selenium/input-events");
	        // Print the title of the page
	        System.out.println("Home page title: " + driver.getTitle());

	        // Press the key
	        builder.sendKeys("S").build().perform();
	        // Press CTRL+A and CTRL+C
	        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

	        // Close the browser
	        driver.close();
	    }
	
}
