package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorClass1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setUP();
        login();

        int num = 10;
        driver.findElement(By.id("ui-id-3"));

        driver.findElement(By.tagName("div/span/a/input/button/"));
        driver.findElement(By.className("logo"));

        driver.findElement(By.linkText("Sign In"));
        driver.findElement(By.partialLinkText("Sign"));

        driver.findElement(By.cssSelector("#ui-id-3"));
///    Welcome Peter
        // different approach
//        <data_Type> var_name = <dat_value>
        WebElement element = driver.findElement(By.id("ui-id-3")); // find a element

        String text = element.getText();
        System.out.println(text); // getText() return the text of the field/element

        if (text.equals("What's New")){
            System.out.println("Verification Pass");
        } else
            System.out.println("Fail.");

        element.click();

        Thread.sleep(6000);

        driver.quit();
    }
    public static void setUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();        //to maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
    }
    public static void login() {
        driver.findElement(By.id("email")).sendKeys("automationqa@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Password123");

        driver.findElement(By.id("send2")).click();
    }
}
// Actions in selection
// click, sendKeys, navigate