package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.CellPhonePage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage;
    CellPhonePage cellPhonePage;
    RegisterPage registerPage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt() {
        homePage = new HomePage();
        cellPhonePage=new CellPhonePage();
        registerPage=new RegisterPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {

//        1.1 Mouse Hover on “Electronics”Tab
        homePage.mouseHoverOnElectronics();
//        1.2 Mouse Hover on “Cell phones” and click
        Thread.sleep(1000);
        cellPhonePage.clickOnCellPhone();
//        1.3 Verify the text “Cell phones”
        String cellPhoneText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(cellPhoneText, "Cell phones", "Not a right product");

    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //        1.1 Mouse Hover on “Electronics”Tab
        homePage.mouseHoverOnElectronics();
        //        1.2 Mouse Hover on “Cell phones” and click
        cellPhonePage.clickOnCellPhone();
        //        1.3 Verify the text “Cell phones”
        String cellPhoneText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(cellPhoneText, "Cell phones", "Not a right product");
        Thread.sleep(1000);
        cellPhonePage.clickOnListView();
        Thread.sleep(1000);
        //click on product name Nokia Lumia 1020
        cellPhonePage.clickOnNokiaLuma();
        String nokiaLumaText = cellPhonePage.verifyNokiaText();
        //verify the text Nokia Lumia 1020
        Assert.assertEquals(nokiaLumaText, "Nokia Lumia 1020", "Verify the text");
        //verify the price
        String actualPrice = cellPhonePage.verifyTotalPrice();
        Assert.assertEquals(actualPrice,"$349.00");
        //change the qty to 2
        cellPhonePage.changeTheQuantity("2");
        Thread.sleep(1000);
        cellPhonePage.clickOnUpdate();
        //Verify the Message "The product has been added to your shopping cart" on Top
        String actualShoppingCartMessage=cellPhonePage.getSuccessMessage();
        Assert.assertEquals(actualShoppingCartMessage,"The product has been added to your shopping cart");
        //close button
        cellPhonePage.clickOnCloseButton();
        Thread.sleep(1000);
        //mousehover on shopping cart and click on goto cart
        cellPhonePage.mouseHoverToShoppingCart();
        cellPhonePage.clickOnGoToCart();
        //click on checkbox
        cellPhonePage.clickOnCheckBox();
        //Click on “CHECKOUT
        cellPhonePage.clickOnCheckout();
        Thread.sleep(1000);
        String actualWelcomeMessage=cellPhonePage.getWelcomeText();
        Assert.assertEquals(actualWelcomeMessage,"Welcome, Please Sign In!");
        //Click on “REGISTER” tab
        cellPhonePage.clickOnRegisterButton();
        //Verify the text “Register”
        String actualRegisterMessage=registerPage.getRegisterText();
        Assert.assertEquals(actualRegisterMessage,"Register","Verify the message");
        //Verify the message “Your registration completed”
        registerPage.setFirstName("Sonia");
        registerPage.setLastName("Gupta");
        registerPage.setEmail("Abcd12@gmail.com");
        registerPage.setCompanyName("Prime");
        registerPage.setPassword("Abcd123$");
        registerPage.setConfirmPassword("Abcd123$");
        //Click on submit button
        registerPage.clickOnRegistrationButton();
        String confirmationText=registerPage.getConfirmationText();
        Assert.assertEquals(confirmationText,"Your registration completed","Didn't get confirmation");
        registerPage.clickOnContinue();

    }


}
