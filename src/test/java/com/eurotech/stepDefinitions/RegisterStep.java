package com.eurotech.stepDefinitions;

import com.eurotech.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStep {
    RegisterPage registerPage=new RegisterPage();
    @Then("The user verifies that Register message")
    public void the_user_verifies_that_register_message() {
        String expectedMessage="Register";
        Assert.assertEquals(expectedMessage,registerPage.registerPageMessage.getText());
    }
    @When("The user selects the Gender {string}")
    public void the_user_selects_the_gender(String gender) {
        registerPage.genderButton(gender);
    }

    @When("The user doesn't select the Gender {string}")
    public void the_user_doesn_t_select_the_gender(String gender) {

    }
    @When("The user enters {string} {string}")
    public void the_user_enters(String inputBoxName, String userInfo) {
        registerPage.inputInfo(inputBoxName,userInfo);
    }
    @When("The user clicks to Register button")
    public void the_user_clicks_to_register_button() {
        registerPage.resgisterClick.click();
    }
    @Then("The user verifies the registered Message")
    public void the_user_verifies_the_registered_message() {
        Assert.assertTrue(registerPage.registerCompleted.isDisplayed());
    }


    @Then("The user verifies the Error Message")
    public void the_user_verifies_the_error_message() {
        registerPage.errorMessage();
    }

    @Then("The user verifies the Existing Email Error Message")
    public void the_user_verifies_the_existing_email_error_message() {
        String expected="The specified email already exists";
        Assert.assertEquals(expected,registerPage.emailAlreadyExistMessage.getText());
    }
}
