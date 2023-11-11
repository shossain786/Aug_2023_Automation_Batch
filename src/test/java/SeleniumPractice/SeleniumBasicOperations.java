package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicOperations {

    public static void login(WebDriver driver) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
    static void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void browserSetup(WebDriver driver){
        driver = new ChromeDriver();  //to open a browser instance
        driver.manage().window().maximize();    //to maximise the browser window
        driver.get("http://localhost:8082/iTinstruct/");
    }

    public static void quiteBrowser(WebDriver driver) {
        driver.quit();
    }
}
