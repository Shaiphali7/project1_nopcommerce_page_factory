package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ComputerProductShoppingCart;
import com.nopcommerce.demo.pages.DesktopProductPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
HomePage homePage;
ComputerPage computerPage;
DesktopProductPage desktopProductPage;
ComputerProductShoppingCart shoppingCart;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt()
{
    homePage=new HomePage();
    computerPage=new ComputerPage();
    desktopProductPage=new DesktopProductPage();
    shoppingCart=new ComputerProductShoppingCart();
}
    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
//        1.1 Click on Computer Menu.
        homePage.mouseHoverOnComputer();

//        1.2 Click on Desktop
        computerPage.clickOnDesktop();
//        1.3 Select Sort By position "Name: Z to A"
//        1.4 Verify the Product will arrange in Descending order.
        //Getting element before filter press
        List<String> desktopNameBefore = computerPage.desktopName();

        computerPage.selectFromDropDown("Name: Z to A");
        List<String> desktopNameAfter = computerPage.desktopName();
        desktopNameBefore.sort(String.CASE_INSENSITIVE_ORDER);
        Assert.assertEquals(desktopNameBefore, desktopNameAfter);

    }
    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
//        2.1 Click on Computer Menu.
        homePage.mouseHoverOnComputer();
//        2.2 Click on Desktop
        computerPage.clickOnDesktop();
//        2.3 Select Sort By position "Name: A to Z"

        computerPage.selectFromDropDown("Name: A to Z");
        Thread.sleep(1000);
//        2.4 Click on "Add To Cart"
        desktopProductPage.addToCartButtonAtDesktopPage();
//        2.5 Verify the Text "Build your own computer"
        String actualProductName = desktopProductPage.buildYourComputerString();
        Assert.assertEquals(actualProductName, "Build your own computer", "Wrong product");
//        2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        desktopProductPage.selectFromprocessorDroDown("2.2 GHz Intel Pentium Dual-Core E2200");
//        2.7.Select "8GB [+$60.00]" using Select class.
        desktopProductPage.selectFromramDropDown("8GB [+$60.00]");
//        2.8 Select HDD radio "400 GB [+$100.00]"
        desktopProductPage.clickOnhddCheckBox();
//        2.9 Select OS radio "Vista Premium [+$60.00]"
        desktopProductPage.clickOnosCheckBox();
//        2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
//            [+$5.00]"
        desktopProductPage.clickOnsoftwareCheckBox();
        Thread.sleep(2000);
//        2.11 Verify the price "$1,475.00"

        String totalPrice = desktopProductPage.getTotalPrice();
        Assert.assertEquals(totalPrice, "$1,470.00", "Total price is not same");
//        2.12 Click on "ADD TO CARD" Button.
        desktopProductPage.clickOnaddToCartProductButton();
        //      2.13 Verify the Message "The product has been added to your shopping cart" on Top
//        green Bar
        String actualSuccessMessage = desktopProductPage.getSuccessMessage();
        String expectedSuccessMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Product is not added to cart");
//        After that close the bar clicking on the cross button.

        desktopProductPage.clickOnCrossButton();
        Thread.sleep(2000);
//        2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCart.mouseHoverToCart();
        shoppingCart.clickOnGoToCart();
//        2.15 Verify the message "Shopping cart"
        String shoppingCartMessage = shoppingCart.getShoppingCartMessage();
        Assert.assertEquals(shoppingCartMessage, "Shopping cart");
//        2.16 Change the Qty to "2" and Click on "Update shopping cart"

        shoppingCart.setUpdateQuantity("2");
        shoppingCart.clickUpdateCart();
        Thread.sleep(2000);
//        2.17 Verify the Total"$2,950.00"
        String cartTotalPrice = shoppingCart.getTotalPrice();
        Assert.assertEquals(cartTotalPrice, "$17,700.00");
//        2.18 click on checkbox “I agree with the terms of service”
        shoppingCart.clickOnTermAndServices();
//        2.19 Click on “CHECKOUT”
        shoppingCart.clickOnCheckOut();
//        2.20 Verify the Text “Welcome, Please Sign In!”
        String welcomeText = shoppingCart.getSignInMessage();
        Assert.assertEquals(welcomeText, "Welcome, Please Sign In!");
        Thread.sleep(1000);
//        2.21Click on “CHECKOUT AS GUEST”Tab
        shoppingCart.clickOnCheckOutAsGuest();
//        2.22 Fill the all mandatory field
        shoppingCart.setFirstNameText("Sonia");
        shoppingCart.setLastNameText("Gupta");
        shoppingCart.setEmailText("Abcd1@gmail.com");
        shoppingCart.selectCountryDropDown("India");
        shoppingCart.setCity("Derby");
        shoppingCart.setAddress("27 maple drive");
        shoppingCart.setZipCode("380023");
        shoppingCart.setPhoneNumber("0879543678");

//        2.23 Click on “CONTINUE”
        shoppingCart.clickOnNextContinueButton();
//        2.24 Click on Radio Button “Next Day Air($0.00)”
        shoppingCart.clickOnRadioButton();
//        2.25 Click on “CONTINUE”
        shoppingCart.clickOnContinue2Button();
//        2.26 Select Radio Button “Credit Card”
        shoppingCart.clickOnPaymentButton();
        shoppingCart.clickOnPaymentMethod();
        Thread.sleep(2000);
//        2.27 Select “Master card” From Select credit card dropdown
        //        2.28 Fill all the details
        shoppingCart.selectFromCreditCard("Master card");
        shoppingCart.sendNameText("Shaiphali");
        shoppingCart.sendCardNumber("5425233430109903");
        shoppingCart.selectMonth("08");
        shoppingCart.selectYear("2023");
        shoppingCart.selectcardCode("123");

        //  2.29 Click on “CONTINUE”
        shoppingCart.clickOnPaymentNextStep();
        Thread.sleep(2000);
        //        2.30 Verify “Payment Method” is “Credit Card”
        String creditcard=shoppingCart.getCardText();

        Assert.assertEquals(creditcard,"Credit Card");
//        2.32 Verify “Shipping Method” is “Next Day Air”
        String delivery=shoppingCart.getDeliveryText();
        Assert.assertEquals(delivery,"Next Day Air");

//        2.34 Click on “CONFIRM”
        shoppingCart.clickOnConfirmButton();
        Thread.sleep(2000);
//        2.35 Verify the Text “Thank You”
        String finalText=shoppingCart.verifyLastPage();
        Assert.assertEquals(finalText,"Thank You");
//        2.36 Verify the message “Your order has been successfully processed!”
        String success=shoppingCart.verifySuccess();
        Assert.assertEquals(success,"Your order has been successfully processed!");


    }



}
