package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//ul/li/a[text()='Cell phones '])[1]")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement cellPhoneText;

    public void clickOnCellPhone() {
        clickOnElement(cellPhone);
    }

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']/a[text()='Nokia Lumia 1020']")
    WebElement nokiaLuma;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1[text()='Nokia Lumia 1020']")
    WebElement textNokiaLuma;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement price;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement chnageQuantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement clickOnUpdate;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement goToCart;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsAndServices;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement register;

    public void clickOnListView() {
        clickOnElement(listView);
        CustomListeners.test.log(Status.PASS, "Click on listView");
    }

    public void clickOnNokiaLuma() {
        clickOnElement(nokiaLuma);
        CustomListeners.test.log(Status.PASS, "Click on nokia luma");
    }

    public String verifyNokiaText() {
        return getTextFromElement(textNokiaLuma);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(price);
    }

    public void changeTheQuantity(String option) {
        sendTextToElement(chnageQuantity, option);
    }

    public void clickOnUpdate() {
        clickOnElement(clickOnUpdate);
        CustomListeners.test.log(Status.PASS, "Click on update Button");
    }

    public String getSuccessMessage() {
        return getTextFromElement(successMessage);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
        CustomListeners.test.log(Status.PASS, "Click on close Button");
    }

    public void mouseHoverToShoppingCart() {
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping cart");
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click on goto cart Button");
    }

    public void clickOnCheckout() {
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS, "Click on checkout Button");
    }

    public void clickOnCheckBox() {
        clickOnElement(termsAndServices);
        CustomListeners.test.log(Status.PASS, "Click on termsAndServices");
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Click on register Button");
    }


}
