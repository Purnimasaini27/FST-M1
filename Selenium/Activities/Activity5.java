package com.example.FST_Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

	public static void main(String[] args) {
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();

	     Actions actions = new Actions(driver);
	       // Open the page
	       driver.get("https://v1.training-support.net/selenium/input-events");
	       // Print the title of the page
	       System.out.println("Home page title: " + driver.getTitle());
	       //left click
	       actions.click().pause(1000).build().perform();
	       String frontText = driver.findElement(By.className("active")).getText();
	       System.out.println("frontText Name : "+ frontText);
	      
	    // Perform left click
	        actions.doubleClick().pause(1000).build().perform();
	        // Print the front side text
	        frontText = driver.findElement(By.className("active")).getText();
	        System.out.println(frontText);

	        // Perform left click
	        actions.contextClick().pause(1000).build().perform();
	        // Print the front side text
	        frontText = driver.findElement(By.className("active")).getText();
	        System.out.println(frontText);
	       
	       // Close the browser
	       driver.close();
	   }
}