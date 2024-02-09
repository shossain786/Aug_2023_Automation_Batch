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

public class MouserOverWithScroll extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;

    @Test(description = "Mouser over test with Scrolling")
    public void mouseHoverTestWithScroll() {
        seleniumHelper = new SeleniumHelper(driver);
        WebElement element = driver.findElement(By.xpath("//span/span[contains(.,'Hover over me')]"));
        Actions actions = new Actions(driver);

//        Scrolling to a field by using Actions class
//        for single operation I can use only .build() method
//        actions.scrollToElement(element).build();

//        for chained action we must have to call .build().perform().
        actions.scrollToElement(element).moveToElement(element).build().perform();
        waitTime(2);

//        actions.moveToElement(element).build().perform();

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
