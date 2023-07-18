package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//ul/li/a[text()='Desktops '])[1]")
    WebElement Desktop;
    By desktopElement = By.xpath("//h2[@class='product-title']/a");
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement dropDownAtoZ;


    public void clickOnDesktop() {

        clickOnElement(Desktop);
        CustomListeners.test.log(Status.PASS, "Click on desktop");
        CustomListeners.test.log(Status.PASS, "Click on desktop");;
    }

    public void selectFromDropDown(String option) {
        selectByVisibleTextFromDropDown(dropDownAtoZ, option);
    }

    public List<String> desktopName() {
        List<WebElement> jacketsElementsList = driver.findElements(desktopElement);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }
}
