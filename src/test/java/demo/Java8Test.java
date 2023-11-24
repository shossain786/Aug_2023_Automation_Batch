package demo;

import org.java.interface4.ChromClass;
import org.java.interface4.FirefoxClass;
import org.java.interface4.Interface1;

public class Java8Test {
    public static void main(String[] args) {
        FirefoxClass firefoxClass = new FirefoxClass();
        firefoxClass.getTitle();
        firefoxClass.getURL(); //calling instance method
        Interface1.navigate();

        int num;
        num = 10;
//        Up casting
        String browser = "firefox";

        Interface1 driver = null;

        if (browser.equals("firefox"))
            driver = new FirefoxClass();
        else if (browser.equals("chrome"))
            driver = new ChromClass();

        driver.getTitle();
        driver.getURL();
        driver.quiteBrowser();
        driver.closeBrowser();

    }
}
