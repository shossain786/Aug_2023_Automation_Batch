package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandling extends SeleniumBasicActions{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);
        driver.findElement(By.xpath("//button[.='Greetings!']")).click();

        waitTime(3);

//        System.out.println("Label: "+ driver.findElement(By.xpath("//label[@for='userid']")).getText());

        System.out.println("Handling the alert");
        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();   // accepting the alert

        waitTime(2);

        System.out.println("Clicked performed");

        System.out.println("Label: "+ driver.findElement(By.xpath("//label[@for='userid']")).getText());

        quiteBrowser(driver);

    }
}
