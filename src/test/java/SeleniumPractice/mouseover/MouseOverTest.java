package SeleniumPractice.mouseover;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverTest extends SeleniumBasicActions {

    WebDriver driver;
    SeleniumHelper seleniumHelper;

    @Test(description = "Mouser over test")
    public void mouseHoverTest() {
        seleniumHelper = new SeleniumHelper(driver);

        WebElement element = driver.findElement(By.xpath("//span/span[contains(.,'Hover over me')]"));
//        WebElement element1 = seleniumHelper.getElement("//span/span[contains(.,'Hover over me')]");

//      Creating an instance of Actions class to handle mouse/keyboard operation
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
