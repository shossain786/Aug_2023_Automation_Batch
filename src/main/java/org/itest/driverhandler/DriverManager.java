package org.itest.driverhandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverManager {
    Logger logger = LogManager.getLogger(DriverManager.class);

    private WebDriver driver;
    Properties properties;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initDiver() throws IOException {
        properties = getProperties();
        launchBrowser();
        manageBrowser();
        return driver;
    }

    private void manageBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(properties.getProperty("url"));
    }

    private void launchBrowser() {
        if (properties.getProperty("browser").equals("firefox")){
            logger.info("Executing test in Firefox Browser.");
            if (properties.getProperty("headless").equals("true"))
                executeFirefoxHeadless();
            else
                driver = new FirefoxDriver();
        }
        else if (properties.getProperty("browser").equals("chrome")){
            logger.info("Executing test in Chrome Browser.");
            if (properties.getProperty("headless").equals("true"))
                executeChromeHeadless();
            else
                driver = new ChromeDriver();
        } else {
            logger.info("Executing test in Chrome Browser.");
            driver = new ChromeDriver();
        }
    }

    public void executeChromeHeadless() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
    public void executeFirefoxHeadless() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    private Properties getProperties() throws IOException {
        String filePath = "./config/config.properties";
        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties.load(fileInputStream);
        return properties;
    }
}
