package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(linkText = "Log in")
    public WebElement loginBtn;
    @FindBy(css = "[id='Email']")
    public WebElement emailInputBox;
    @FindBy(css = "[id='Password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitBtn;

    public void login(String email, String password){
        loginBtn.click();
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        submitBtn.click();
        BrowserUtils.waitFor(2);
    }

}
