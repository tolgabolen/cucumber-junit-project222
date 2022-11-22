package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyTitlePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTitleVerification_StepDefinitions {

    EtsyTitlePage etsyTitlePage = new EtsyTitlePage();
    @Given("User is on etsy page")
    public void user_is_on_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("User sees title as Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_as_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyTitlePage.searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
    }
    @Then("User sees Wooden Spoon in the etsy title")
    public void user_sees_wooden_spoon_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Wooden spoon - Etsy";

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
