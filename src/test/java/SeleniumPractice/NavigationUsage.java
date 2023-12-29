package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NavigationUsage extends SeleniumBasicActions{

    WebDriver driver;
    @Test
    public void nagigateTest() {
        driver = browserSetup(driver);
        login(driver);

        driver.findElement(By.xpath("//a[.='Books List']")).click();
        waitTime(2);
        driver.navigate().back();
        waitTime(1);
        driver.navigate().forward();

        driver.navigate().refresh();

        waitTime(2);

        driver.navigate().to("https://googmle.com");

        driver.get("https://googmle.com");

        waitTime(2);
        quiteBrowser(driver);
    }

    @Test
    public void urlTest(){
        driver = browserSetup(driver);
        waitTime(2);

        driver.navigate().to("http://goopp.com/");

        driver.get("http://goopp.com/");

        waitTime(2);

        quiteBrowser(driver);
    }
}
