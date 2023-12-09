package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandleClass2 extends SeleniumBasicActions{
    static WebDriver driver;
    public static void main(String[] args) {
        driver = browserSetup(driver);
        login(driver);
        //click on the button to open a new window
        driver.findElement(By.xpath("//button[@id='new_win_btn']")).click();
//        storing/getting the main window id
        String mainWindow = driver.getWindowHandle();
//        fetching the ids of all windows
        Set<String> windowsList = driver.getWindowHandles();
        System.out.println("number of windows: " + windowsList.size());
        windowsList.remove(mainWindow);
//        storing new window id into a variable
        String newWindowId = windowsList.iterator().next();
//        navigate to a new window
        driver.switchTo().window(newWindowId);
//        getting the text from the new window
        String label = driver.findElement(By.xpath("//h2[.='Welcome to the New Window']")).getText();

        System.out.println(label);

//        entering text into text field in new window
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Java");

        waitTime(2);
//      closing the new window
        driver.close();  // .close() -> it close the current focused window
//      switching back to main window
        driver.switchTo().window(mainWindow);
        boolean enableStatus1 = driver.findElement(By.xpath("//button[@id='showToasterBtn']")).isEnabled();
        System.out.println("Enabling status of the button before entering text: " + enableStatus1);

//        entering text into a field of the main page
        driver.findElement(By.xpath("//input[@id='inputField']")).sendKeys("Selenium");
//        verify the Show toaster button getting enabled
        boolean enableStatus = driver.findElement(By.xpath("//button[@id='showToasterBtn']")).isEnabled();

        System.out.println("Enabling status of the button: " + enableStatus);

        waitTime(3);
//        driver.quit();  // .quite() -> // it closes all the opened windows
        quiteBrowser(driver);
    }
}
