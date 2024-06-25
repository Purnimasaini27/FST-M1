package com.example.FST_Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) {
   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // Open the page
       driver.get("https://v1.training-support.net/selenium/target-practice");
       // Print the title of the page
       System.out.println("Home page title: " + driver.getTitle());

      driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
      driver.findElement(By.xpath("//h5[text() = 'Fifth header']")).getText();
      
      driver.findElement(By.xpath("//button[text() = 'Violet']")).getAttribute("class");
      driver.findElement(By.xpath("//button[text() = 'Grey']")).getText();
      
       // Close the browser
       driver.close();
   }
}