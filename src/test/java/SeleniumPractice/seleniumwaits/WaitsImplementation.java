package SeleniumPractice.seleniumwaits;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsImplementation extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;

    @Test(description = "Test with usage of implicit wait")
    public void waitTest() {
        driver.findElement(By.xpath("//a[.='Contact']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium");
        SeleniumBasicActions.waitTime(4);
    }
    @Test(description = "By using the library method")
    public void waitTimeTest() {
        seleniumHelper = new SeleniumHelper(driver);
        seleniumHelper.getElement("//a[.='Contact']").click();
        seleniumHelper.getElement("//input[@id='name']").sendKeys("Selenium");
        SeleniumBasicActions.waitTime(4);
    }
    @BeforeMethod
    public void testSetUP(){
        driver = browserSetup(driver);
        login(driver);
    }
    @AfterMethod
    public void endTest(){
        quiteBrowser(driver);
    }
}
