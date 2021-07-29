package com.readingplus.step_definitions;

import com.readingplus.pages.LoginPage;
import com.readingplus.pages.ManagePage;
import com.readingplus.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManageStepDefinition {
    LoginPage loginPage = new LoginPage();
    ManagePage managePage = new ManagePage();

//    @When("I am on my Overview page")
//   public void i_am_on_my_overview_page() {
//       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//        loginPage.educatorLogin();
//    }
    @When("I click on manage")
    public void i_click_on_manage() {
     managePage.manageButtonClick();
    }


    @Then("I should be able to see {string} in title")
    public void iShouldBeAbleToSeeInTitle(String keyword) {
        String currentUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(currentUrl.contains(keyword));
    }
}
