package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling{
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
//        WebDriver driver  = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

        SeleniumBasicActions.waitTime(4);
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("(//a[.='Try it Yourself »'])[1]")).click();

        SeleniumBasicActions.waitTime(2);
        System.out.println(driver.getTitle());

        String currentWindow = driver.getWindowHandle();

        System.out.println(currentWindow);

        Set<String> windows = driver.getWindowHandles();

        System.out.println("Number of windows opened: " + windows.size());

        windows.remove(currentWindow);

        String newWindow = windows.iterator().next();

        driver.switchTo().window(newWindow);

        System.out.println("Title of new Page: " + driver.getTitle());

        String text = driver.findElement(By.xpath("//span[.='The Window Object']")).getText();

        System.out.println(text);

        driver.quit();
    }
}
