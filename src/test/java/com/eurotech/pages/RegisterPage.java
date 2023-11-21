package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//h1[text()='Register']")
    public WebElement registerPageMessage;
    @FindBy(css = "[class=result]")
    public WebElement registerCompleted;
    @FindBy(id = "register-button")
    public WebElement resgisterClick;
    @FindBy(css = "[class=validation-summary-errors]")
    public WebElement emailAlreadyExistMessage;


//    @FindBy(id = "FirstName")
//    public WebElement inputFirstName;
//    @FindBy(id = "LastName")
//    public WebElement inputLastName;
//    @FindBy(id = "Email")
//    public WebElement inputEmail;
//    @FindBy(id = "Password")
//    public WebElement inputPassword;
//    @FindBy(id = "ConfirmPassword")
//    public WebElement inputConfirmPassword;



    public void genderButton(String gender){
        WebElement genderBttn = Driver.get().findElement(By.xpath("//label[text()='" + gender + "']"));
        genderBttn.click();
    }
    public void inputInfo(String inputBoxName,String userInfo){
        WebElement inputInfo = Driver.get().findElement(By.xpath("//input[@name='" + inputBoxName + "']"));
        inputInfo.sendKeys(userInfo);
    }
    public void errorMessage(){
        Driver.get().findElement(By.className("field-validation-error")).getText();
    }

}
