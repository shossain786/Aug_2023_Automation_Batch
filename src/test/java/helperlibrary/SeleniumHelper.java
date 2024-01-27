package helperlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
    WebDriver driver;

    public SeleniumHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String xpathValue) {
        return driver.findElement(By.xpath(xpathValue));
    }

    public void clickOnElement(String xpath) {
//        driver.findElement(By.xpath(xpath)).click();
        getElement(xpath).click();
    }

//    public

}
