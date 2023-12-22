package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling extends SeleniumBasicActions {
    static WebDriver driver;
    @Test
    public void testIFrame() {
        driver = browserSetup(driver);
        login(driver);

//        Switching to an iframe
        WebElement element = driver.findElement(By.xpath("//iframe[@src='iframes/se_frame.html']"));
        driver.switchTo().frame(element);

        driver.findElement(By.xpath("//input[@id='f_sub']")).sendKeys("12334234");

//        switching back to main/default window
        driver.switchTo().defaultContent();
//        taking action in a field of the main window
        driver.findElement(By.xpath("//input[@id='inputField']")).sendKeys("Selenium");

        waitTime(3);
        quiteBrowser(driver);
    }
}
