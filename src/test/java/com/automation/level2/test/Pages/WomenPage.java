package com.automation.level2.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    public WebDriver driver;

    @FindBy(linkText = "Jackets")
    private WebElement womenJacket;


    public WomenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public JacketTopWomenPage clickOnJacket(){
        womenJacket.click();
        return new JacketTopWomenPage(driver);
    }
}
