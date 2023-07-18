package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[1]")
    WebElement addToCartButton;
    By productName = By.xpath("//div[@class='product-name']");

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddCheckBox;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osCheckBox;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCheckBox;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartProductButton;



    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement getTotalPrice;

    By successMessage=By.xpath("//p[@class='content']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButton;



    public void addToCartButtonAtDesktopPage()
    {
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to cart button");
    }
    public String buildYourComputerString()
    {
        return getTextFromElement(productName);
    }



    public void selectFromprocessorDroDown(String option)
    {
        selectByVisibleTextFromDropDown(processorDropDown,option);
        CustomListeners.test.log(Status.PASS, "Select from processor dropdown");
    }
    public void selectFromramDropDown(String option)
    {
        selectByVisibleTextFromDropDown(ramDropDown,option);
        CustomListeners.test.log(Status.PASS, "Select from Ram dropdown");
    }
    public void clickOnosCheckBox()
    {
        clickOnElement(osCheckBox);
        CustomListeners.test.log(Status.PASS, "Click in checkbox");
    }
    public void clickOnhddCheckBox()
    {
        clickOnElement(hddCheckBox);
        CustomListeners.test.log(Status.PASS, "Click on hdd checkbox");
    }
    public void clickOnsoftwareCheckBox()
    {
        clickOnElement(softwareCheckBox);
        CustomListeners.test.log(Status.PASS, "Click on hdd checkbox");
    }
    public String getTotalPrice()
    {
        return getTextFromElement(getTotalPrice);

    }

    public void clickOnaddToCartProductButton()
    {
        clickOnElement(addToCartProductButton);
        CustomListeners.test.log(Status.PASS, "click On addToCart Product Button");
    }
    public String getSuccessMessage()
    {
        return getTextFromElement(successMessage);
    }
    public void clickOnCrossButton()
    {
        clickOnElement(closeButton);
        CustomListeners.test.log(Status.PASS, "Click on hdd checkbox");
    }


}
