package com.metlife.StepDefinition;

import com.metlife.pageobjects.Loginpage;
import com.metlife.utilities.WebdriverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("open browser and launch url")
    public void usererror() {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtility.initialize();
        WebdriverUtility.navigate("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");
    }
    @When("User enter correct {string} and {string} ")
    public void user_enter_correct_source_as(String string , String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        WebdriverUtility.type(Loginpage.username, string);
        WebdriverUtility.type(Loginpage.pwd,string2);
    }
    @When("User click on login button")
    public void user_click_the_login_button(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtility.click(Loginpage.login_btn);
        throw new io.cucumber.java.PendingException();
    }
    @When("I choose the date as 4th of next month")
    public void i_choose_the_date_as_4th_of_next_month() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @When("I click on Search Busses")
    public void i_click_on_search_busses() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I should get the message as {string}")
    public void i_should_get_the_message_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
}
