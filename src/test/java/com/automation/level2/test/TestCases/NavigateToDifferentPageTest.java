package com.automation.level2.test.TestCases;

import com.automation.level2.test.Pages.HomePage;
import com.automation.level2.test.Pages.SalePage;
import com.automation.level2.test.TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateToDifferentPageTest extends TestBase {
    public WebDriver driver;
    public HomePage homePage;
    public SalePage salePage;

    public NavigateToDifferentPageTest() throws Exception {
        super();
    }

    @BeforeTest
    public void setup(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));

    }

    @Test()
    public void verifyNavigateFrmHomePageToDifferentPage() throws InterruptedException {
        homePage = new HomePage(driver);
        salePage = homePage.clickOnSaleOption();
        Assert.assertTrue(salePage.getValidationTextFromSalePage().contains(dataprop.getProperty("expectedText")));
    }


    @AfterTest
    public void tearUp(){
        driver.quit();
    }
}
