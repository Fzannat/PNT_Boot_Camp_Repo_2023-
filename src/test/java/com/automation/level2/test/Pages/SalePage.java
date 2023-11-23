package com.automation.level2.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalePage {
    public WebDriver driver;

    @FindBy(xpath = "//span[text() = 'Sale']")
    private WebElement successMessageFromSalePage;

    public SalePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getValidationTextFromSalePage(){
        String validationText = successMessageFromSalePage.getText();
        return validationText;
    }
}
