package com.eurotech.pages;

import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
   @FindBy(xpath = "(//ul[@class='top-menu']/li)[1]")
    public WebElement category;
   @FindBy(xpath = "(//input[@type='button'])[2]")
    public WebElement computingAndInternet;

}
