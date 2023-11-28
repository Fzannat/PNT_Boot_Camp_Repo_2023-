package com.automation.level3.TestCases.NavigateToLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLoginPage {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com//");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @Test
    public void verifySignInWithValidCredential() throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys("fz@gmail.com");
        driver.findElement(By.id("loginpassword")).sendKeys("Selenium@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        String actualLoginConfirmation = driver.findElement(By.xpath("//a[text() = 'Welcome fz@gmail.com']")).getText();
        String expectedLoginConfirmation = "Welcome fz@gmail.com";
        Assert.assertTrue(actualLoginConfirmation.contains(expectedLoginConfirmation));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
