package com.readingplus.step_definitions;

import com.readingplus.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        Driver.getDriver().manage().window().maximize();
    }

    @BeforeStep
    public void beforeStep(){

    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

       // Driver.closeDriver();
    }

}
