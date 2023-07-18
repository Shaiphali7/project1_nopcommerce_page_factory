package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")
    WebElement ElectronicsMenu;

    public void mouseHoverOnComputer() {
        mouseHoverToElement(computerMenu);
    }
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(ElectronicsMenu);
    }
}
