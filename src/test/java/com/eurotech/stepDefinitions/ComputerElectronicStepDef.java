package com.eurotech.stepDefinitions;

import com.eurotech.pages.CategoryPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerElectronicStepDef {
    CategoryPage categoryPage=new CategoryPage();
    @When("The user navigate to a Computers category")
    public void the_user_navigate_to_a_computers_category() {
      categoryPage.computers.click();
    }

    @When("The user clicks {string}")
    public void the_user_clicks(String subMenu) {
        categoryPage.computerMenu(subMenu).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user clicks on the sort by menu and verifies that the default Position option is visible in the menu.")
    public void the_user_clicks_on_the_sort_by_menu_and_verifies_that_the_default_position_option_is_visible_in_the_menu() {
      categoryPage.verifyDefaultOptions();
    }


}
