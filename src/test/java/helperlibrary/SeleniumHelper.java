package helperlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {
    WebDriver driver;
    WebDriverWait wait;

    public SeleniumHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement getElement(String xpathValue) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
    }

    public void clickOnElement(String xpath) {
        getElement(xpath).click();
    }

    public void enterData(String xpath, String data) {
        getElement(xpath).sendKeys(data);
    }

    public String getText(String xpath){
        return getElement(xpath).getText();
    }
}
