package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class SeleniumBasicActions {

    public static void login(WebDriver driver) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
    static void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebDriver browserSetup(WebDriver driver){
//        new ChromeDriver() always create a new Chrome profile and its not same as our local browser profile
//        everytime its launches new chrome its always similar to incognitoMode. Which means its do not load
//        the existing browser cookies data or the browser which is already quite

        String path = System.getProperty("user.dir") + "\\downloads\\";
        System.out.println(path);

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", path);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);  //to open a browser instance
        driver.manage().window().maximize();    //to maximise the browser window
        driver.get("http://localhost:8080/iTinstruct-1.3.5/");
        return driver;
    }

    public static void quiteBrowser(WebDriver driver) {
        driver.quit();
    }
}
