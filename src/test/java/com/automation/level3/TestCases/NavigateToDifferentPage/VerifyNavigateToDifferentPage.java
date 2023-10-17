package com.automation.level3.TestCases.NavigateToDifferentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyNavigateToDifferentPage {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @Test
    public void verifyNavigateToDifferentPage(){
        driver.findElement(By.linkText("Store")).click();
        WebElement findAStoreNearYouLink = driver.findElement
                (By.xpath("//a[text() = 'Find one near you']"));
        Assert.assertTrue(findAStoreNearYouLink.isEnabled());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}



