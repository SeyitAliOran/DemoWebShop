package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
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





    public WebElement categoriesMenu(String category) {
        List<WebElement> categoryMenu = Driver.get().findElements(By.xpath("//li[@class='inactive']"));

        for (WebElement product : categoryMenu) {
            if (product.getText().equals(category)) {
                return product;
            }
        }
        return null;
    }

    public void userSelectsMenu(WebElement element,String option) {
        Select select=new Select(element);
        select.selectByVisibleText(option);

//        WebElement optionMenu = Driver.get().findElement(By.xpath("//option[text()='" + opt + "']"));
//        Select select = new Select(optionMenu);
//        select.selectByVisibleText(opt);


    }
}