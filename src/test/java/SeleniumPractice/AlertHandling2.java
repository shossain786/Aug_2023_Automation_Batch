package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandling2 extends SeleniumBasicActions{
    static WebDriver driver;

    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);

        driver.findElement(By.xpath("//button[@id='empId01']")).click();

        waitTime(2);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Abc123");

//        alert.dismiss();
        alert.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        quiteBrowser(driver);

    }
}
