package com.readingplus.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){

    }

    public static WebDriver getDriver(){

        String browser = ConfigurationReader.getProperty("browser");
        if (driver == null){
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
               default:
                    throw  new RuntimeException("Error, No such a browser");
           }
        }

//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
//        System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver.exe");
//        System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
//        System.setProperty("phantomjs.binary.path", "/path/to/phantomjs");
//        System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");

//        WebDriverManager.chromedriver();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
//        driver = new ChromeDriver();

       return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
