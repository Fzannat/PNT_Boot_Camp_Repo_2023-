package com.automation.level2.test.Pages;

import com.automation.level2.java.Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage{
    public WebDriver driver;
    @FindBy(id = "firstname")
    private WebElement firstNameInputBox;

    @FindBy(id = "lastname")
    private WebElement lastNameInputBox;

    @FindBy(id = "email_address")
    private WebElement emailAddressNameInputBox;

    @FindBy(id = "password")
    private WebElement passwordInputBox;

    @FindBy(id = "password-confirmation")
    private WebElement confirmedPasswordInputBox;

    @FindBy(xpath = "//button[@title='Create an Account']/parent::div")
    private WebElement createAnAccountButton;

    public CreateNewCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterFirstname(String firstName){
        firstNameInputBox.sendKeys(firstName);
    }
    public void enterLastname(String lastName){
        lastNameInputBox.sendKeys(lastName);
    }
    public void enterEmailAddress(String email){
        emailAddressNameInputBox.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordInputBox.sendKeys(password);
    }
    public void enterConfirmPassword(String password){
        confirmedPasswordInputBox.sendKeys(password);
    }
    public MyAccountPage clickOnCreateAnAccountButton() throws InterruptedException {
        createAnAccountButton.click();
        Thread.sleep(1000);
        return new MyAccountPage(driver);
    }
    public MyAccountPage registerWithAllMandatoryDetail(String firstName, String lastName, String email, String password) throws InterruptedException {
        enterFirstname(firstName);
        enterLastname(lastName);
        enterEmailAddress(email);
        enterPassword(password);
        enterConfirmPassword(password);
        clickOnCreateAnAccountButton();
        return new MyAccountPage(driver);
    }
}
