package com.automation.level2.test.TestCases;

import com.automation.level2.test.Pages.CheckOutPage;
import com.automation.level2.test.Pages.HomePage;
import com.automation.level2.test.Pages.JacketTopWomenPage;
import com.automation.level2.test.Pages.WomenPage;
import com.automation.level2.test.TestBase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCartTest extends TestBase {
    public WebDriver driver;
    public HomePage homePage;
    public WomenPage womanPage;
    public JacketTopWomenPage jacketTopWomenPage;
    public CheckOutPage checkOutPage;

    public ShoppingCartTest() throws Exception {
        super();
    }

    @BeforeTest
    public void setUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));

    }

    @Test
    public void verifyShoppingCartForCorrectProduct() throws InterruptedException {
        homePage = new HomePage(driver);
        womanPage = homePage.clickOnWomenLink();
        jacketTopWomenPage = womanPage.clickOnJacket();
        checkOutPage = jacketTopWomenPage.addAProductToCartAndNavigateToCheckoutPage();
        Assert.assertTrue(checkOutPage.getProductDetail().contains(dataprop.getProperty("validProductDetails")));
    }

    @AfterTest
    public void tearUp(){
        driver.quit();
    }
}
