package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FileUpload extends SeleniumBasicActions {
    WebDriver driver;
    @Test
    public void uploadFileTest() {
        driver = browserSetup(driver);
        login(driver);

//        uploading file in webPage
        String filePath = "C:\\Users\\Admin\\Downloads\\sb_icon (1).png";
        driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys(filePath);

        System.out.println(driver.findElement(By.xpath("//input[@id='myFile']")).getText());
        waitTime(6);

        quiteBrowser(driver);
    }
}
