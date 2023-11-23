package com.automation.level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutProduct {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void verifyCheckoutOption(){
        driver.findElement(By.linkText("Laptops")).click();
        driver.findElement(By.xpath("//a[text() = 'Sony vaio i5']")).click();
//        String productName = driver.findElement(By.xpath("//h2[@class = 'name']")).getText();
//        System.out.println(productName);
        //driver.findElement(By.cssSelector("a.btn.btn-success")).click();
    }

    @AfterTest
    public void tearUp(){
        driver.quit();
    }
}
