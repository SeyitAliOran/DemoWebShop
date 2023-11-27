package com.eurotech.stepDefinitions;

import com.eurotech.pages.HomePage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Display_StepDef {
    HomePage homePage = new HomePage();

    @Given("The user navigates to website")
    public void the_user_navigates_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user cliks on the books category")
    public void the_user_cliks_on_the_category() {
        homePage.booksCategoriBtn.click();

    }

    @Then("The user verifies display menu")
    public void the_user_verifies_display_menu() {
        homePage.verifyDisplayMenu();

    }

    @When("The user cliks on the computers category")
    public void the_user_cliks_on_the_computers_category() {
        homePage.computersCategoriBtn.click();

    }

    @When("The user cliks on the desktops category")
    public void the_user_cliks_on_the_desktops_category() {
        homePage.desktopsCategoriBtn.click();

    }

    @When("The user click on the display menu and select the number")
    public void the_user_click_on_the_display_menu_and_select_the_number() {
        homePage.displayDropDown();
    }

    @Then("The user verifies that products are displayed on the page")
    public void the_user_verifies_that_products_are_displayed_on_the_page() {
        homePage.verifyFourItems();
    }
}
