package com.example.FST_Selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
      
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username and password fields
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        // Find and click the submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Print the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
    }
}
