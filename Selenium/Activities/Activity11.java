package com.example.FST_Selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	 public static void main(String[] args) {
	       
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	        // Create the Wait object
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
	        // Print the title of the page
	        System.out.println("Home page title: " + driver.getTitle());

	        // Find the checkbox and click it
	        WebElement checkbox = driver.findElement(By.name("toggled"));
	        checkbox.click();
	        System.out.println("Checkbox is selected: " + checkbox.isSelected());
	        // Click the checkbox to deselect it
	        checkbox.click();
	        System.out.println("Checkbox is selected: " + checkbox.isSelected());

	        // Close the browser
	        driver.close();
	    }
}
