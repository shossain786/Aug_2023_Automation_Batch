package SeleniumPractice.javascriptexecutor;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;

    @Test(description = "Mouser over test with JavaScriptExecutor")
    public void javaScriptExecutorScroll() {
        seleniumHelper = new SeleniumHelper(driver);
        WebElement element = driver.findElement(By.xpath("//span/span[contains(.,'Hover over me')]"));

//      JavaScriptExecutor is an Interface which is implemented in RemoteWebDriver class.
//      Its is used for special cases where Selenium WebDriver is unable to perform some operations and we have any
//      actions available from Selenium WebDriver.
//      By using JavaScriptExecutor we can perform operations like click, sendKeys, scroll page etc.
//    int --> 10
//    float --> 10.0
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollToElement", element);
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//input[@type='submit']")));

        System.out.println("JavaScript executor executed");

        waitTime(2);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        String text = seleniumHelper.getText("//div[.='Welcome to Selenium Learning!']");
        System.out.println("Text found: " + text);
        waitTime(3);
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
