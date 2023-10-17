package com.automation.level3.TestCases.NavigateToHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {
   public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/");

    }
    @Test
    public void verifyTheTitleOfApplePage(){
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
