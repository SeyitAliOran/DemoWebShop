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

public class HomePage extends BasePage {
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
    @FindBy(tagName = "h1")
    public WebElement headerMessage;
    @FindBy(xpath = "(//a[@href='/desktops'])[3]")
    public WebElement desktopsBtn;
    @FindBy(xpath = "(//a[@href='/notebooks'])[3]")
    public WebElement notebooksBtn;
    @FindBy(xpath = "(//a[@href='/accessories'])[3]")
    public WebElement accessoriesBtn;


    public void viewCategories(String category) {
        Driver.get().findElement(By.xpath("(//a[@href='/" + category + "'])[3]")).click();
//        if (category.equals("computers")){
//            desktopsBtn.click();
//            notebooksBtn.click();
//            accessoriesBtn.click();
//        }
    }

    public void sortProduct(String sort1, String sort2, String sort3) {
        Select select = new Select(displaySelectBtn);
        select.selectByVisibleText(sort1);
        select.selectByVisibleText(sort2);
        select.selectByVisibleText(sort3);


    }





    public void displayDropDown() {
        Select select = new Select(displaySelectBtn);
        select.selectByValue("https://demowebshop.tricentis.com/desktops?pagesize=4");
    }

    public void verifyFourItems() {
        List<WebElement> productList = Driver.get().findElements(By.className("item-box"));
        System.out.println("productList.size() = " + productList.size());
        int actualProductCount = productList.size();
        int expectedProductCount = 4;
        Assert.assertEquals(expectedProductCount, actualProductCount);

    }


}
