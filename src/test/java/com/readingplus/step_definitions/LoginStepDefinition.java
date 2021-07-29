package com.readingplus.step_definitions;

import com.readingplus.pages.LoginPage;
import com.readingplus.utilities.ConfigurationReader;
import com.readingplus.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("I am on login page")
    public void i_am_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       // Driver.getDriver().manage().window().maximize();
    }

    @When("I click on Educator Login button")
    public void iClickOnEducatorLoginButton() throws InterruptedException {
      // Thread.sleep(3000);
        //loginPage.educatorLoginButton.click();

    }

    @And("I enter my username and password and I click on login button")
    public void i_enter_my_username_and_password() {
//        loginPage.usernameBox.sendKeys("islem.ouiddir@readingplus.com");
//        loginPage.passwordBox.sendKeys("rall7shay1VING@eagh");

        loginPage.educatorLogin();
    }



    @Then("I should be able to see Overview page title")
    public void i_should_be_able_to_see_dashboard_page_title() throws InterruptedException {
       // Thread.sleep(3000);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("overview"));

    }


}
