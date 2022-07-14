package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GmailLinkVerificationInGooglePage {

    GoogleSearchPage gmailLinkPOM = new GoogleSearchPage();
    @Given("user is on google homepage")
    public void user_is_on_google_homepage() {
        Driver.getDriver().get("https://www.google.com");

    }
    @When("user should see Gmail link in google home page")
    public void user_should_see_gmail_link_in_google_home_page() {
        gmailLinkPOM.gmailLink.isDisplayed();

    }
    @When("user clicking on Gmail module")
    public void user_clicking_on_gmail_module() {
gmailLinkPOM.gmailLink.click();

    }
    @Then("user should see Gmail in title")
    public void user_should_see_gmail_in_title() {
String expect = "Gmail";
String actual = Driver.getDriver().getTitle();
Assert.assertTrue(expect, actual.contains(expect));


    }

}
