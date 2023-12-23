package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling2 extends SeleniumBasicActions{
    WebDriver driver;
    @Test
    public void mulitpleFrameHandlingTest() {
        driver = browserSetup(driver);
        login(driver);
        //        Switching to the first frame iframe
        WebElement element = driver.findElement(By.xpath("//iframe[@src='iframes/se_frame.html']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//input[@id='f_sub']")).sendKeys("12334234");
//        switching back to main window
        driver.switchTo().defaultContent();
//switching to the another frame
        driver.switchTo().frame("myFrame");
        waitTime(2);

        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Pune, India");

        waitTime(2);
        quiteBrowser(driver);
    }
}
