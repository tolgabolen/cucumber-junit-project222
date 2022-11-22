package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Vytrack_Stepdef {

    VytrackPage vytrackPage = new VytrackPage();
    @Given("user is on the vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
    }
    @Given("user clicks to forgot your password button")
    public void user_clicks_to_forgot_your_password_button() {
        vytrackPage.forgotButton.click();
    }
    @Then("user should see title as Forgot Password")
    public void user_should_see_title_as_forgot_password() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Forgot Password";

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
