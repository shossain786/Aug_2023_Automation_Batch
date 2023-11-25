package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumClass6 extends SeleniumBasicActions{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);

        WebElement name = driver.findElement(By.xpath("//input[@id='userid']"));

        name.sendKeys("100");

        waitTime(2);

        System.out.println("GetText Value: " + name.getText());
        System.out.println("GetAttribute Value: " + name.getAttribute("value"));

        System.out.println("Label: "+ driver.findElement(By.xpath("//label[@for='userid']")).getText());


        quiteBrowser(driver);
    }
}
