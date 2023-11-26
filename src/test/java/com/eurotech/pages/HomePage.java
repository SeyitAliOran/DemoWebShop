package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import org.openqa.selenium.Beta;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    @FindBy(xpath = "(//ul[@class='top-menu']/li)[1]")
    public WebElement categoryBooks;
    @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
    public WebElement addToCartBtn;
    @FindBy(xpath = "(//ul[@class='top-menu']/li)[4]")
    public WebElement categoryApparelShoes;

    @FindBy(linkText = "Blue and green Sneaker")
    public WebElement blueAndGreenSneaker;

    @FindBy(xpath = "//input[@id='addtocart_28_EnteredQuantity']")
    public WebElement enteredQuantity;

    @FindBy(xpath = "//input[@id='add-to-cart-button-28']")
    public WebElement addToCartBtn2;

    @FindBy(xpath = "(//ul[@class='top-menu']/li)[5]")
    public WebElement categoryDigitalDownloads;
    @FindBy(xpath = "(//input[@type='button'])[3]")
    public WebElement album_3rd;

    public void addProduct() {
        categoryBooks.click();
        System.out.println("categoryBooks.getText() = " + categoryBooks.getText());
        BrowserUtils.scrollToElement(addToCartBtn);
        BrowserUtils.waitForClickablility(addToCartBtn, 5).click();
    }

    public void addProducktWithQuantity(String quantity) {
        categoryApparelShoes.click();
        BrowserUtils.scrollToElement(blueAndGreenSneaker);
        blueAndGreenSneaker.click();
        enteredQuantity.clear();
        enteredQuantity.sendKeys(quantity);
        addToCartBtn2.click();
    }
    public void addToCartBtn3(){
        categoryDigitalDownloads.click();
        album_3rd.click();
        BrowserUtils.waitFor(3);
    }
}