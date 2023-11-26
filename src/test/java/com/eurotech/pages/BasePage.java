package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public abstract class BasePage { // BasePage uzerinden obje olusturmayacagimiz icin abstract yaptik
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.get(),10);
    @FindBy(linkText = "Log in")
    public WebElement loginBtn;

    @FindBy(linkText = "Shopping cart")
    public WebElement shoppingCartBtn;

}
