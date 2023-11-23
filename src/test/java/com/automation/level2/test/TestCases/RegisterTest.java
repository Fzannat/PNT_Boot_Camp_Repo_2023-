package com.automation.level2.test.TestCases;

import com.automation.level2.java.Utilities.Util;
import com.automation.level2.test.Pages.CreateNewCustomerPage;
import com.automation.level2.test.Pages.HomePage;
import com.automation.level2.test.Pages.MyAccountPage;
import com.automation.level2.test.TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    public WebDriver driver;
    public HomePage homePage;
    public CreateNewCustomerPage createNewCustomerPage;
    public MyAccountPage myAccountPage;

    public RegisterTest() throws Exception {
        super();
    }

    @BeforeTest
    public void setUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
    }
    @Test
    public void verifyRegisterWithValidCredential() throws InterruptedException {
        homePage = new HomePage(driver);
        createNewCustomerPage = homePage.clickOnCreateANewAccountLink();
        myAccountPage = createNewCustomerPage.registerWithAllMandatoryDetail(dataprop.getProperty("firstName"),
                dataprop.getProperty("lastName"), Util.generateRandomEmailWithDateStamp(), dataprop.getProperty("password"));
        Assert.assertTrue(myAccountPage.getActualConfirmationTex().contains(dataprop.getProperty("expectedConfirmationTex")));

    }


    @AfterTest
    public void tearUp(){
        driver.quit();
    }

}
