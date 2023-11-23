package com.automation.level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gggg {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        System.out.println(driver.getTitle());
    }

    @Test(priority = 1)
    public void navigateToHomePage(){
        driver.findElement(By.id("cat")).isDisplayed();
        driver.findElement(By.linkText("Phones")).click();
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearUp(){
        driver.quit();
    }
}
