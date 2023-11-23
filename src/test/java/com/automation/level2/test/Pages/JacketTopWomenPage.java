package com.automation.level2.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JacketTopWomenPage {
    public WebDriver driver;

    @FindBy(xpath = "//ol[@class='products list items product-items']/li[1]")
    private WebElement  oliviaZipLightJacket;

    @FindBy(id = "option-label-size-143-item-167")
    private WebElement smallSizeOption;

    @FindBy(id = "option-label-color-93-item-50")
    private WebElement blueColorOption;

    @FindBy(id ="product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(css = "a.action.showcart")
    private WebElement cartOption;

    @FindBy(id ="top-cart-btn-checkout")
    private WebElement proceedToCheckoutLink;



    public JacketTopWomenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnOliviaZipLightJacket() throws InterruptedException {
        oliviaZipLightJacket.click();
        Thread.sleep(1000);
    }
    public void clickOnSmallSize() throws InterruptedException {
        smallSizeOption.click();
        Thread.sleep(1000);
    }
    public void selectBlackColor() throws InterruptedException {
        blueColorOption.click();
        Thread.sleep(1000);
    }
    public void clickOnAddCartButton() throws InterruptedException {
        addToCartButton.click();
        Thread.sleep(2000);
    }

    public void chooseSizeColor() throws InterruptedException {
        clickOnSmallSize();
        selectBlackColor();
    }

    public void addAProductToCart() throws InterruptedException {
        clickOnOliviaZipLightJacket();
        chooseSizeColor();
        clickOnAddCartButton();
        Thread.sleep(1000);
    }
    public void clickOnProceedToCheckoutLink() throws InterruptedException {
        proceedToCheckoutLink.click();
        Thread.sleep(1000);
    }
    public void clickOnCartOption() throws InterruptedException {
        cartOption.click();
        Thread.sleep(1000);
    }
    public void navigateToCheckoutOption() throws InterruptedException {
        clickOnCartOption();
        clickOnProceedToCheckoutLink();
    }
    public CheckOutPage addAProductToCartAndNavigateToCheckoutPage() throws InterruptedException {
        addAProductToCart();
        navigateToCheckoutOption();
        return new CheckOutPage(driver);
    }


}
