package org.itest.magneto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
    Logger logger = LogManager.getLogger(HomePageTest.class);
    HomePage homePage;

    @Test
    public void verifyTitle() {
        logger.info("Verify Title Test Started!");
        homePage = new HomePage(driver);
        logger.info("Title found from web ui: " + homePage.getTitle());
        Assert.assertEquals(homePage.getTitle(), "Home Page");
        logger.info("Verify Title Test Completed!");
    }

    @Test
    public void verifyUrl() {
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getUrl(), "https://magento.softwaretestingboard.com/");
    }

    @Test
    public void verifySaleMenu() {
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getSaleText(), "Sale");
    }
}
