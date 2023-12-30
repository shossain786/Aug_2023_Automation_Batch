package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FileDownloadHandling extends SeleniumBasicActions {
    WebDriver driver;
    @Test
    public void downLoadFileTest(){
        driver = browserSetup(driver);
        login(driver);

        driver.findElement(By.xpath("//a[@id='export']")).click();
        driver.findElement(By.xpath("//a[@id='export']")).click();

        waitTime(5);

        quiteBrowser(driver);
    }
}
