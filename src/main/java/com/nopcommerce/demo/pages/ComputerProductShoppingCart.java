package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerProductShoppingCart extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Go to cart')]")
    WebElement GoToCart;
    @CacheLookup
    @FindBy(xpath ="//h1[text()='Shopping cart']")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath ="//input[@class='qty-input']")
    WebElement updateQuantity;
    @CacheLookup
    @FindBy(id ="updatecart")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath ="(//span[@class='value-summary'])[1]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id ="termsofservice")
    WebElement termsAndServices;
    @CacheLookup
    @FindBy(id ="checkout")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath ="//h1[text()='Welcome, Please Sign In!']")
    WebElement signMessage;

    public void mouseHoverToCart() {
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "MouseHover To shopping Cart");
    }

    public void clickOnGoToCart() {
        clickOnElement(GoToCart);
        CustomListeners.test.log(Status.PASS, "Click on goto cart");
    }

    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    public void setUpdateQuantity(String quantity) {
        sendTextToElement(updateQuantity, quantity);
        CustomListeners.test.log(Status.PASS, "Update uantity ");
    }

    public void clickUpdateCart() {
        clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS, "Click on update cart");
    }

    public String getTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermAndServices() {
        clickOnElement(termsAndServices);
        CustomListeners.test.log(Status.PASS, "Click on termsAndServices");
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS, "Click on checkOut Button");
    }

    public String getSignInMessage() {
        return getTextFromElement(signMessage);
    }

    //---------------------------------------------------------------------
    //Click on "CheckOutAsAGuest"
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkOutAsGuest;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_ZipPostalCode")
    WebElement zipCode;
    @CacheLookup
    @FindBy(id ="BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 new-address-next-step-button']")
    WebElement nextContinueButton;
    @CacheLookup
    @FindBy(id ="shippingoption_1")
    WebElement radioButton;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement secondContinue;
    @CacheLookup
    @FindBy(id ="paymentmethod_1")
    WebElement paymentButton;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethod;


    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
        CustomListeners.test.log(Status.PASS, "Click on check out as a guest Button");
    }

    public void setFirstNameText(String option) {
        sendTextToElement(firstName, option);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void setLastNameText(String option) {
        sendTextToElement(lastName, option);
        CustomListeners.test.log(Status.PASS, "Enter firstName " + firstName);
    }

    public void setEmailText(String option) {
        sendTextToElement(email, option);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void selectCountryDropDown(String option) {
        selectByVisibleTextFromDropDown(country, option);
        CustomListeners.test.log(Status.PASS, "Enter country " + country);
    }

    public void setCity(String option) {
        sendTextToElement(city, option);
        CustomListeners.test.log(Status.PASS, "Enter city " + city);
    }

    public void setAddress(String option) {
        sendTextToElement(address, option);
        CustomListeners.test.log(Status.PASS, "Enter address " + address);
    }

    public void setZipCode(String option) {
        sendTextToElement(zipCode, option);
        CustomListeners.test.log(Status.PASS, "Enter zipCode " +zipCode);
    }

    public void setPhoneNumber(String option) {
        sendTextToElement(phoneNumber, option);
        CustomListeners.test.log(Status.PASS, "Enter phoneNumber " + phoneNumber);
    }

    public void clickOnNextContinueButton() {
        clickOnElement(nextContinueButton);
        CustomListeners.test.log(Status.PASS, "Click on nextContinueButton");
    }

    public void clickOnRadioButton() {
        clickOnElement(radioButton);
        CustomListeners.test.log(Status.PASS, "Click on radioButton");
    }

    public void clickOnContinue2Button() {
        CustomListeners.test.log(Status.PASS, "Click on clickOnContinue2Button");
    }

    public void clickOnPaymentButton() {
        clickOnElement(paymentButton);
        CustomListeners.test.log(Status.PASS, "Click on clickOnPaymentButton");
    }

    public void clickOnPaymentMethod() {
        clickOnElement(paymentMethod);
        CustomListeners.test.log(Status.PASS, "Click on clickOnPaymentMethod");
    }

    //_____________________________________________-
    //Credit Card method
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardType;
    @CacheLookup
    @FindBy(id = "CardholderName")

    WebElement holderName;
    @CacheLookup
    @FindBy(id ="CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id ="ExpireMonth")
    WebElement month;
    @CacheLookup
    @FindBy(id ="ExpireYear")
    WebElement year;
    @CacheLookup
    @FindBy(id ="CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 payment-info-next-step-button']")
    WebElement afterCardbutton;
    @CacheLookup
    @FindBy(xpath ="//li[@class='payment-method']/span[@class='value']")
    WebElement verifyCardText;
    @CacheLookup
    @FindBy(xpath ="//li[@class='shipping-method']/span[@class='value']")
    WebElement verifyDelivery;
    @CacheLookup
    @FindBy(xpath ="//span[@class='product-subtotal']")
    WebElement verifytotal;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 confirm-order-next-step-button']")
    WebElement verifyButton;

    @CacheLookup
    @FindBy(xpath ="//div[@class='page-title']/h1")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='title']/strong")
    WebElement verifyTextSuccess;
    @CacheLookup
    @FindBy(xpath ="//button[@class='button-1 order-completed-continue-button']")
    WebElement orderComplete;
    @CacheLookup
    @FindBy(xpath ="//div[@class='topic-block-title']/h2")
    WebElement verifyTextWelcomeToStore;

    public void selectFromCreditCard(String option) {
        selectByVisibleTextFromDropDown(creditCardType, option);
        CustomListeners.test.log(Status.PASS, "select card type Password " + creditCardType);
    }

    public void sendNameText(String option) {
        sendTextToElement(holderName, option);
        CustomListeners.test.log(Status.PASS, "select card holder name " + option);
    }

    public void sendCardNumber(String option) {
        sendTextToElement(cardNumber, option);
        CustomListeners.test.log(Status.PASS, "Enter card number " + option);
    }

    public void selectMonth(String option) {
        selectByVisibleTextFromDropDown(month, option);
        CustomListeners.test.log(Status.PASS, "Select month" + option);
    }

    public void selectYear(String option) {
        selectByVisibleTextFromDropDown(year, option);
        CustomListeners.test.log(Status.PASS, "Enter year " + option);
    }

    public void selectcardCode(String option) {
        sendTextToElement(cardCode, option);
        CustomListeners.test.log(Status.PASS, "selectcardCode" + option);
    }

    public void clickOnPaymentNextStep() {
        clickOnElement(afterCardbutton);
        CustomListeners.test.log(Status.PASS, "Click on card button");
    }

    public String getCardText() {
        return getTextFromElement(verifyCardText);
    }

    public String getDeliveryText() {
        return getTextFromElement(verifyDelivery);
    }

    public String getTotalPriceAfter() {
        return getTextFromElement(verifytotal);
    }

    public void clickOnConfirmButton() {
        clickOnElement(verifyButton);
        CustomListeners.test.log(Status.PASS, "Click on confirm Button");
    }

    public String verifyLastPage() {
        return getTextFromElement(verifyText);
    }

    public String verifySuccess() {
        return getTextFromElement(verifyTextSuccess);
    }

}
