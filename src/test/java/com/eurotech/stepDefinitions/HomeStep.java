package com.eurotech.stepDefinitions;

import com.eurotech.pages.HomePage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStep {
    HomePage homePage=new HomePage();
    @Given("The user open the Url")
    public void the_user_open_the_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user click Register button")
    public void the_user_click_register_button() {
        homePage.registerBtn.click();
    }
}
