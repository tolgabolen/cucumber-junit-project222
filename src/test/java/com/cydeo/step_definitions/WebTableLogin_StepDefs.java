package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String name) {
        webTableLoginPage.inputName.sendKeys(name);
    }


    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters username {string} password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String userPassword) {

//        webtablePage.inputName.sendKeys(username);
//        webtablePage.inputPassword.sendKeys(userPassword);
//        webtablePage.loginBtn.click();
        webTableLoginPage.login(username, userPassword);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials){
//           webtablePage.inputName.sendKeys(credentials.get("username"));
//           webtablePage.inputPassword.sendKeys(credentials.get("password"));
//           webtablePage.loginBtn.click();

           webTableLoginPage.login(credentials.get("username"), credentials.get("password"));


   }
}