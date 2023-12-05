package com.eurotech.stepDefinitions;

import com.eurotech.pages.HomePage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Display_StepDef {
    HomePage homePage = new HomePage();

    @Given("The user navigates to website")
    public void the_user_navigates_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
     @When("The user clicks {string} category")
    public void theUserClicksCategory(String category) {
        homePage.viewCategories(category);
    }

    @Then("The user should be able to see {string}")
    public void theUserShouldBeAbleToSee(String headerMessage) {
        assertEquals(headerMessage,homePage.headerMessage.getText());
    }

    @When("The user clicks on the display menu and select the {string} or {string} or {string}")
    public void andTheUserClicksOnTheDisplayMenuAndSelectTheOrOr(String sort1, String sort2, String sort3) {
        homePage.sortProduct(sort1,sort2,sort3);
    }


}
