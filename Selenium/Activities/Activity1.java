package com.example.FST_Selenium_project;

//Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\FST_Selenium_project\\src\\test\\java\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

     // Open the page
     driver.get("https://v1.training-support.net");
     // Print the title of the page
     System.out.println("Home page title: " + driver.getTitle());

     // Find About Us link using id and click it
     driver.findElement(By.id("about-link")).click();
     // Print the title of the new page
     System.out.println("About page title: " + driver.getTitle());

     // Close the browser
     driver.close();
 }
}