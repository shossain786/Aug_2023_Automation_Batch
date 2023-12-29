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

//        virtual file
        File dest = new File("./sc_image.png");

//        Java object
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        Convert the java object file to real file system
        FileUtils.copyFile(file, dest);

        quiteBrowser(driver);
    }
}
