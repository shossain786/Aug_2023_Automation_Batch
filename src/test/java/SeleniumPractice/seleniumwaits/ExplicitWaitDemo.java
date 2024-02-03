package SeleniumPractice.seleniumwaits;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitDemo extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;

    @Test(description = "Applying Explicit wait")
    public void useOfExplicitWait() {
        seleniumHelper = new SeleniumHelper(driver);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); //create an instance of WebDriverWait class
//
//        WebElement blinkingText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='delaytext']/p")));

        System.out.println("Text fetched: " + seleniumHelper.getText("//label[@id='delaytext']/p"));
        SeleniumBasicActions.waitTime(3);

/*
        WebElement element = null;
        By by = null;
//        Example of mostly used Explicit waits in selenium
        wait.until(ExpectedConditions.alertIsPresent()); //to keep wait until alert appears in the webpage
        wait.until(ExpectedConditions.visibilityOf(element)); //to wait for a specific field to be displayed in the ui by passing the WebElement
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)); // to wait for a specific field to be displayed in the ui by passing
                                                                        // by object reference
        wait.until(ExpectedConditions.elementToBeClickable(element)); //to keep wait until a field is clickable in the UI by passing WebElement
        wait.until(ExpectedConditions.elementToBeClickable(by)); //to keep wait until a field is clickable in the UI by passing by object reference

        wait.until(ExpectedConditions.presenceOfElementLocated(by)); //to keep wait until the field is present/loaded in the DOM
        wait.until(ExpectedConditions.elementToBeSelected(element)); //to keep wait until the field is selectable in the UI by passing WebElement
        wait.until(ExpectedConditions.elementToBeSelected(by)); //to keep wait until the field is selectable in the UI by passing By object reference
*/
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
