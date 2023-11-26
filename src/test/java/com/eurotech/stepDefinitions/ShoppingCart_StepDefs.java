package com.eurotech.stepDefinitions;

import com.eurotech.pages.CartPage;
import com.eurotech.pages.HomePage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ShoppingCart_StepDefs {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    CartPage cartPage=new CartPage();
    @Given("The user navigates to homepage")
    public void the_user_navigates_to_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user clicks on login button and enters {string} and {string} credentials")
    public void the_user_clicks_on_login_button_and_enters_and_credentials(String email, String password) {
        loginPage.login(email, password);
    }
    @When("The user adds Computing and Internet product from Books category")
    public void the_user_adds_computing_and_internet_product_from_books_category() {
        homePage.addProduct();
    }
    @When("The user adds {string} piece Blue and green Sneaker from the Apparel & Shoes category")
    public void the_user_adds_piece_blue_and_green_sneaker_from_the_apparel_shoes_category(String quantity) {
        homePage.addProducktWithQuantity(quantity);
    }
    @When("The user removes Computing and Internet chosen product from Cart Page")
    public void the_user_removes_computing_and_internet_chosen_product_from_cart_page() {
        cartPage.updateCart();
    }
    @When("The user clicks on the continue shopping button")
    public void the_user_clicks_on_the_continue_shopping_button() {
        cartPage.continueShopping();
    }
    @When("The user adds 3rd Album product from Digital downloads category")
    public void the_user_adds_3rd_Album_product_from_digital_downloads_category() {
        homePage.addToCartBtn3();
    }
    @Then("The user verifies purchase amount")
    public void the_user_verifies_purchase_amount() {
        homePage.shoppingCartBtn.click();
        Assert.assertTrue(cartPage.totalAmount.isDisplayed());
    }
}
