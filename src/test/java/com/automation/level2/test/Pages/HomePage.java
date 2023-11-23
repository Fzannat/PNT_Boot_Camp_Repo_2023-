package com.automation.level2.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    @FindBy(xpath = "//span[text() = 'Sale']")
    private WebElement saleOption;

    @FindBy(xpath = "//span[text() = 'Sale']")
    private WebElement womenOption;

    @FindBy(linkText = "Create an Account")
    private WebElement createAnAccountLink;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public SalePage clickOnSaleOption() throws InterruptedException {
        saleOption.click();
        Thread.sleep(1000);
        return new SalePage(driver);
    }
    public WomenPage clickOnWomenLink(){
        womenOption.click();
        return new WomenPage(driver);
    }
    public CreateNewCustomerPage clickOnCreateANewAccountLink(){
        createAnAccountLink.click();
        return new CreateNewCustomerPage(driver);
    }


}
