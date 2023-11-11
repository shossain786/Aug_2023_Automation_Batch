package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass2 {
    static WebDriver driver;
    public static void main(String[] args) {
        browserSetup();

        //login to application
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //action in home page
        // findElement return WebElement type object
        WebElement fullName = driver.findElement(By.xpath("//input[@id='userid']"));
        fullName.sendKeys("Java Selenium");

        waitTime(3);
        fullName.clear();

        waitTime(2);
        fullName.sendKeys("Selenium");
        waitTime(3);

        quiteBrowser();
    }

    static void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void browserSetup(){
        driver = new ChromeDriver();  //to open a browser instance
        driver.manage().window().maximize();    //to maximise the browser window
        driver.get("http://localhost:8082/iTinstruct/");
    }

    public static void quiteBrowser() {
        driver.quit();
    }
}
