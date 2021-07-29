package com.readingplus.pages;

import com.readingplus.utilities.ConfigurationReader;
import com.readingplus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='login']/a[@class='educator login']")
    private WebElement educatorLoginButton;

    @FindBy(name = "j_username")
    private WebElement usernameBox;

    @FindBy(name = "j_password")
    private WebElement passwordBox;

    @FindBy(xpath = "//button[@class='login']")
    private WebElement loginButton;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public void educatorLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(educatorLoginButton)).click();
       // educatorLoginButton.click();
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
