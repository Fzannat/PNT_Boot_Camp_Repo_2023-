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
        driver.get("https://www.apple.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @Test
    public void verifySignInWithValidCredential(){
        driver.findElement(By.id("globalnav-menubutton-link-bag")).click();
        driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
        //driver.findElement(By.xpath("//div[contains(@class, ' form-cell-wrapper')]"));//.sendKeys("Shahnewasshahana@gmail.com");
        WebElement userEmailInputBox = driver.findElement(By.id("account_name_text_field"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}