package com.readingplus.pages;

import com.readingplus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagePage {

    public ManagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

  @FindBy(xpath = "//span[.='manage']")
  private WebElement manageButton;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    public void manageButtonClick(){
        wait.until(ExpectedConditions.elementToBeClickable(manageButton)).click();

    }
}
