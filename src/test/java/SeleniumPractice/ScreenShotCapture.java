package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotCapture extends SeleniumBasicActions{
    WebDriver driver;
    @Test
    public void captureScreeShot() throws IOException {
        driver = browserSetup(driver);
        login(driver);

//        virtual file path of the file to store -> its user defined
        File destination = new File("./sc_image.png");

//        Java object
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        Convert the java object file to real file system
        FileUtils.copyFile(file, destination);
//        how to delete the cookies?
        driver.manage().deleteAllCookies();

        quiteBrowser(driver);
    }
}
