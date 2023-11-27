package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage{
    @FindBy(xpath = "(//a[@href='/books'])[3]")
    public WebElement booksCategoriBtn;
    @FindBy(xpath = "//span[.='Display']")
    public WebElement displayMenu;
    @FindBy(xpath = "(//a[@href='/computers'])[3]")
    public WebElement computersCategoriBtn;
    @FindBy(xpath = "(//a[@href='/desktops'])[3]")
    public WebElement desktopsCategoriBtn;
    @FindBy(id = "products-pagesize")
    public WebElement displaySelectBtn;
    @FindBy(className = "item-box")
    public WebElement productNumberperPage;


    public void verifyDisplayMenu(){
        String actualText = displayMenu.getText();
        String expectedText = "Display";
        Assert.assertEquals(expectedText,actualText);
    }

    public void displayDropDown(){
        Select select = new Select(displaySelectBtn);
        select.selectByValue("https://demowebshop.tricentis.com/desktops?pagesize=4");
    }

    public void verifyFourItems(){
        List<WebElement> productList = Driver.get().findElements(By.className("item-box"));
        System.out.println("productList.size() = " + productList.size());
        int actualProductCount = productList.size();
        int expectedProductCount = 4;
        Assert.assertEquals(expectedProductCount,actualProductCount);

    }


}
