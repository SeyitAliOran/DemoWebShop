package com.eurotech.pages;


import com.eurotech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "//span[text()='Sort by']")
    public WebElement sortBy;
    @FindBy(id = "products-orderby")
    public WebElement productsOrderBy;
    @FindBy(xpath = "//ul[@class='top-menu']/li[2]/a")
    public WebElement computers;
    @FindBy(xpath = "//option[text()='Position']")
    public WebElement defaultPosition;

    public WebElement categoriesMenu(String category) {
        List<WebElement> categoryMenu = Driver.get().findElements(By.xpath("//li[@class='inactive']"));

        for (WebElement product : categoryMenu) {
            if (product.getText().equals(category)) {
                return product;
            }
        }
        return null;
    }
    public void userSelectsMenu(WebElement element, String option) {
        Select select = new Select(element);
        select.selectByVisibleText(option);

    }

    public WebElement computerMenu(String product) {
        List<WebElement> computerSubMenu = Driver.get().findElements(By.xpath("//ul[@class='sublist']/li/a"));
        for (WebElement subMenu : computerSubMenu) {
            if (subMenu.getText().equals(product)) {
                return subMenu;
            }
        }
        return null;
    }

    public void verifyDefaultOptions() {
        String actualText = defaultPosition.getText();
        String expectedText = "Position";
        Assert.assertEquals(expectedText, actualText);

    }
}