package com.readingplus.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {
                "html:target/cucumber.html"


        },
        features = "src/test/resources/features",
        glue = "com/readingplus/step_definitions"



)
public class CucumberRunner {
}                                                   
