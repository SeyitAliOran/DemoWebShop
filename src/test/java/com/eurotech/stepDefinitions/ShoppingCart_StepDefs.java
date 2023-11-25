package com.eurotech.stepDefinitions;

import com.eurotech.pages.HomePage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCart_StepDefs {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
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
        homePage.category.click();
        homePage.computingAndInternet.click();
        BrowserUtils.waitFor(2);
    }

    @When("The user adds {string} piece {string} from the {string} category")
    public void the_user_adds_piece_from_the_category(String string, String string2, String string3) {

    }

    @When("The user removes {string} chosen product from Cart Page")
    public void the_user_removes_chosen_product_from_cart_page(String string) {

    }

    @When("The user clicks on the continue shopping button")
    public void the_user_clicks_on_the_continue_shopping_button() {

    }
    @When("The user adds {string} product from {string} category")
    public void the_user_adds_product_from_category(String string, String string2) {

    }


    @Then("The user verifies purchase amount")
    public void the_user_verifies_purchase_amount() {

    }
}
