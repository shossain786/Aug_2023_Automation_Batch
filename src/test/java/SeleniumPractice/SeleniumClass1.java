package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1 {
    public static void main(String[] args) {
     //   System.setProperty("webdriver.chrome.driver" , "");
        WebDriver driver = new ChromeDriver();  //to open a browser instance
        driver.manage().window().maximize();    //to maximise the browser window
        driver.get("https://yahoo.com");        // to navigate a url
//        driver.close();
        driver.quit();                          //to quite the launched browser
    }
}
