package org.itest.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.itest.libs.RestAssuredUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class APIBaseTest {
    Logger logger = LogManager.getLogger(APIBaseTest.class);
    public RestAssuredUtils restAssuredUtils = new RestAssuredUtils();

    @BeforeMethod
    public void setUpAPI(){
        logger.debug("**********************************BeforeMethod Started**********************************");
        restAssuredUtils.setBaseURI();
        restAssuredUtils.setContentType("application/json");
        logger.debug("**********************************BeforeMethod Completed**********************************");
    }

    @AfterMethod
    public void tearDown() {
        logger.debug("**********************************AfterMethod Started**********************************");
        restAssuredUtils.resetBaseURI();
        restAssuredUtils.resetBasePath();
        logger.debug("**********************************AfterMethod Completed**********************************");
    }
}
