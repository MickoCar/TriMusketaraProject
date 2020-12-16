package com.library.stepDefinitions;

import com.library.pages.LoginPage;
import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on a login page")
    public void user_is_on_a_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }


    @When("User enters enter wright credentials")
    public void user_enters_enter_wright_credentials() {
       loginPage.login();
       BrowserUtils.wait(3);
    }
    @Then("User should see dashboard page")
    public void user_should_see_dashboard_page() {
       String expected = "Dashboard";
       String actual = Driver.getDriver().getTitle();
    }
}