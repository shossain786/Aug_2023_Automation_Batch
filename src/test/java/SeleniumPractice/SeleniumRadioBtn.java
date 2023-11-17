package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumRadioBtn extends SeleniumBasicActions{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);
//        verify that Java radio button is by default selected
        WebElement javaRadioBtn = driver.findElement(By.xpath("//input[@id='contactChoice1']"));
        boolean status = javaRadioBtn.isSelected();
//        isSelected() : it is a method inside WebElement class which returns whether a radio button/checkbox is selected or not.
//        it returns true if the field is selected and false for either case
        System.out.println(status);

//        perform click on radio button on Python
        driver.findElement(By.xpath("//input[@id='contactChoice2']")).click();
        waitTime(2);
//      verify that Java radio button is now not selected
        System.out.println(javaRadioBtn.isSelected());
        System.out.println("------------------------------------");

        //perform click on checkbox
        driver.findElement(By.xpath("//input[@name='B']")).click();
        driver.findElement(By.xpath("//input[@name='C']")).click();

        System.out.println(driver.findElement(By.xpath("//input[@name='B']")).isSelected());
        waitTime(1);
        driver.findElement(By.xpath("//input[@name='B']")).click();

        waitTime(2);
        quiteBrowser(driver);
    }
}

// sendkeys, click(),
// What is radio button and how it behaves?
// What is checkbox and tell me something about its behavior.
// How to select radio button/check box in webpage?
// How to uncheck already selected radio button/check box in webpage?
// How to verify if a radio button/check box in webpage is selected or not?
