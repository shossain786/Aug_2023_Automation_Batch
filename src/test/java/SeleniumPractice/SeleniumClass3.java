package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumClass3 extends SeleniumBasicActions{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);
        //Select dropdown handling
        WebElement carrier = driver.findElement(By.xpath("//select[@name='cars']"));
        Select select = new Select(carrier);
        waitTime(1);
//        different ways of selecting values from a dropdown
        select.selectByVisibleText("Performance Tester");
        waitTime(1);
//        select.selectByIndex(3);
//        waitTime(1);
//        select.selectByValue("saab");
//         Verify the selected data of the dropdown
        WebElement element = select.getFirstSelectedOption();
        System.out.println(element.getText());  // getText() -> return the text we can see in the webUI.
//        getText() is a method which is defined inside WebElement class, and it returns text displayed in webpage of an element

        List<WebElement> options = select.getOptions();
//      to get all dropdown options we have to use getOptions() method of Select class
        for (WebElement element1 : options)
            System.out.println(element1.getText());

        waitTime(2);
        quiteBrowser(driver);
    }

}

// How to avoid defining same methods in all classes?   Ans: define the re-usable methods in a library class
// What all the ways to call/use the methods defined in library class?
// 1. By creating object of another class   (most recommendation way)
// 2. By using static keyword in methods declaration of the another class (less recommend way)
// 3. By using inheritance concept (least recommend way)
