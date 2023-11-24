package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumClass5 extends SeleniumBasicActions{
    static WebDriver driver;

    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);

        boolean displayValue = driver.findElement(By.xpath("//select[@id='engineer']")).isDisplayed();

        boolean enabledValue = driver.findElement(By.xpath("//select[@id='engineer']")).isEnabled();

        System.out.println(displayValue);
        System.out.println(enabledValue);

        boolean hiddenDisplay = driver.findElement(By.xpath("//button[.='Submit']")).isDisplayed();

        System.out.println(hiddenDisplay);

//        handling field which is not present in the HTML document
        boolean var1 = driver.findElement(By.xpath("//input[@id='phone']")).isDisplayed();

        System.out.println(var1);
        quiteBrowser(driver);
    }
}
