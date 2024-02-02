package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class SeleniumBasicActions {

    public static void login(WebDriver driver) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
    public static void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebDriver browserSetup(WebDriver driver) {
//        new ChromeDriver() always create a new Chrome profile and it's not same as our local browser profile
//        everytime its launches new chrome it's always similar to incognitoMode. Which means its do not load
//        the existing browser cookies data or the browser which is already quite
//      String fielPath = "D:\\GitProjects\\Aug_2023_Automation_Batch";
        String path = System.getProperty("user.dir") + "\\downloads\\";
        System.out.println(path);

//        Gathering all required information into a map before setting up the Chrome profile
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", path);

//        ChromeOptions is used to setup customized user profile
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);  //to open a browser instance
        driver.manage().window().maximize();    //to maximise the browser window
        driver.get("http://localhost:8080/iTinstruct-1.3.5/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    public void setUpFirefox() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addPreference("browser.download.folderList", 2);
        firefoxOptions.addPreference("browser.download.dir" , "path of the download location");
        firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "");

        new FirefoxDriver(firefoxOptions);
    }

    public static void quiteBrowser(WebDriver driver) {
        driver.quit();
    }
}
