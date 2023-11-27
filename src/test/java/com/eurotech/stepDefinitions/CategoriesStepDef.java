package com.eurotech.stepDefinitions;

import com.eurotech.pages.CategoryPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategoriesStepDef {
    CategoryPage categoryPage = new CategoryPage();


    @Given("The user is on the home page.")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user navigate to a {string} category")
    public void the_user_navigate_to_a_category(String category) {
        categoryPage.categoriesMenu(category).click();
    }
    @When("The user verifies that there is a sort by function in the Category.")
    public void the_user_verifies_that_there_is_a_function_in_the_category() {
        Assert.assertTrue(categoryPage.sortBy.getText().contains("Sort by"));
    }

    @Then("The user clicks on the sort by menu and verifies that the {string} option is visible in the menu.")
    public void the_user_clicks_on_the_menu_and_verifies_that_the_option_is_visible_in_the_menu(String option) {
        categoryPage.userSelectsMenu(categoryPage.productsOrderBy,option);
    }
}
