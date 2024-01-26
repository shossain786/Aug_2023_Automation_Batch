package SeleniumPractice.webtable;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableHandling1 extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;
    @BeforeMethod
    public void setUPTest() {
        driver = browserSetup(driver);
        login(driver);
    }
    @AfterMethod
    public void endTest(){
        quiteBrowser(driver);
    }
    @Test
    public void handleWebTable(){
        seleniumHelper = new SeleniumHelper(driver);
        seleniumHelper.clickOnElement("//a[.='Books List']");
    }
}
