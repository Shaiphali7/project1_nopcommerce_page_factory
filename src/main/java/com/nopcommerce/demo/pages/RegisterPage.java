package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Company")
    WebElement companyName;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement verifyRegistrationComplete;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continue1;

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void setFirstName(String option) {
        sendTextToElement(firstName, option);
        CustomListeners.test.log(Status.PASS, "Enter firstName " + firstName);
    }

    public void setLastName(String option) {
        sendTextToElement(lastName, option);
        CustomListeners.test.log(Status.PASS, "Enter ElastName " + lastName);
    }

    public void setEmail(String option) {
        sendTextToElement(email, option);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void setCompanyName(String option) {
        sendTextToElement(companyName, option);
        CustomListeners.test.log(Status.PASS, "Enter companyName " + companyName);
    }

    public void setPassword(String option) {
        sendTextToElement(password, option);
        CustomListeners.test.log(Status.PASS, "Enter password " + password);
    }

    public void setConfirmPassword(String option) {
        sendTextToElement(confirmPassword, option);
        CustomListeners.test.log(Status.PASS, "Enter confirmPassword " + confirmPassword);
    }

    public String getConfirmationText() {
        return getTextFromElement(verifyRegistrationComplete);
    }

    public void clickOnRegistrationButton() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on registerButton");
    }

    public void clickOnContinue() {
        clickOnElement(continue1);
        CustomListeners.test.log(Status.PASS, "Click on continue Button");
    }

}
