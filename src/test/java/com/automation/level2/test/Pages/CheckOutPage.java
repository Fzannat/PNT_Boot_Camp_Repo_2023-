package com.automation.level2.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    public WebDriver driver;

    @FindBy(className = "product-item-name")
    private WebElement addedProductName;

    @FindBy(xpath = "//span[text() ='View Details']")
    private WebElement viewDetailDropdown;
    @FindBy(xpath = "//dd[text() ='S']")
    private WebElement sizeOfAddedJacket;
    @FindBy(xpath = "//dd[text() ='Blue']")
    private WebElement colorOfAddedJacket;
    @FindBy(xpath = "//span[text() = 'Item in Cart']")
    private WebElement itemInCartDropDown;


    public CheckOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnItemInCartDropdown() throws InterruptedException {
        itemInCartDropDown.click();
        Thread.sleep(1000);
    }

    public String getTheNameOfTheAddedProduct(){
        String productName = addedProductName.getText();
        return productName;
    }
    public void clickOnVewDetailDropdown() throws InterruptedException {
        viewDetailDropdown.click();
        Thread.sleep(1000);
    }
    public String getTheSizeOfTheAddedProduct(){
        return sizeOfAddedJacket.getText();
    }
    public String getTheColorOfTheAddedProduct(){
        return colorOfAddedJacket.getText();
    }
    public String getProductDetail() throws InterruptedException {
        clickOnItemInCartDropdown();
        clickOnVewDetailDropdown();
        String productDetail = getTheNameOfTheAddedProduct()+", "+ getTheSizeOfTheAddedProduct()+", "+ getTheColorOfTheAddedProduct();
        return productDetail;
    }

}
