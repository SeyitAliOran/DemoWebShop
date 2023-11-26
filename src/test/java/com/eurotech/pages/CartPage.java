package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Computing and Internet'])[2]/../../td/input[1]")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@name='updatecart']")
    public WebElement updateCart;

    @FindBy(xpath = "//input[@name='continueshopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "(//span[@class='nobr'])[7]/../..")
    public WebElement totalAmount;

    public void updateCart(){
        shoppingCartBtn.click();
        checkBox.click();
        updateCart.click();
    }

    public void continueShopping(){
        continueShopping.click();
    }

}
