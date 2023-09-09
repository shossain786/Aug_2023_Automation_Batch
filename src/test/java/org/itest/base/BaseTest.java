package org.itest.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.driverhandler.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    Logger logger = LogManager.getLogger(BaseTest.class);
    public WebDriver driver;
    Properties properties;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void beforeSuite() throws IOException {
        properties = getProperties();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        driver = new DriverManager().initDiver();
    }

    @AfterMethod
    public void tearDownTest() {
        driver.quit();
    }

    Properties getProperties() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("./config/config.properties"));
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }
}
