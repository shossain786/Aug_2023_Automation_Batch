package org.itest.magneto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By sale = By.xpath("//span[.='Sale']");

    public String getSaleText() {
        return driver.findElement(sale).getText();
    }
    public String getTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
