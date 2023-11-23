package com.automation.level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest {
    public WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void verifyRegisterWithValidCredential(){
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Create an Account")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("firstname")).sendKeys("Abdul");
        driver.findElement(By.id("lastname")).sendKeys("Ataul");
        driver.findElement(By.id("email_address")).sendKeys("abdul54321@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Abc@32132");
        driver.findElement(By.id("password-confirmation")).sendKeys("Abc@32132");
        driver.findElement(By.xpath("//button[@class = 'action submit primary']/span")).click();
        System.out.println(driver.getTitle());
        //driver.findElement(By.className("nav item current")).isDisplayed();
//        String expected = "Thank you for registering with Main Website Store.";
//        String actual = driver.findElement(By.xpath
//                ("//div[text() = 'Thank you for registering with Main Website Store.']")).getText();
//        Assert.assertTrue(actual.contains(expected));

    }


    //driver.findElement(By.xpath("//button[@class = 'action submit primary']/parent::div")).isEnabled();
//        driver.findElement(By.xpath("//button[@class = 'action submit primary']")).click();
    @Test
    public void test(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/index/");
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearUp(){
        driver.quit();
    }

}
