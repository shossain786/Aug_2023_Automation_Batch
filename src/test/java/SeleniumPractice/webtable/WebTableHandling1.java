package SeleniumPractice.webtable;

import SeleniumPractice.SeleniumBasicActions;
import helperlibrary.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableHandling1 extends SeleniumBasicActions {
    WebDriver driver;
    SeleniumHelper seleniumHelper;
    @BeforeMethod
    public void setUPTest() {
        driver = browserSetup(driver);
        login(driver);
    }
    @AfterMethod
    public void endTest(){
        quiteBrowser(driver);
    }
    @Test
    public void handleWebTable(){
        seleniumHelper = new SeleniumHelper(driver);
        seleniumHelper.clickOnElement("//a[.='Books List']");
//        fething data from the webtable
        int rowNum = 0;
        int colNum =0;
        String cellXpath = "//table/tbody/tr["+rowNum+"]/td["+colNum+"]";
        int numOfRows = driver.findElements(By.xpath("//table/tbody/tr")).size();
        int numOfCols = driver.findElements(By.xpath("//table/thead/tr/th")).size();

        for (rowNum = 1; rowNum <= numOfRows; rowNum++) {
            for (colNum = 1; colNum <= numOfCols; colNum++) {
                System.out.print(driver.findElement(
                        By.xpath("//table/tbody/tr["+rowNum+"]/td["+colNum+"]")).getText() + " || ");
            }
            System.out.println("\n");
        }

        List<WebElement> authorsList =  driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        int targetRowNum = 0;
        for (int i = 0; i<authorsList.size(); i++){
            if (authorsList.get(i).getText().equals("William Johnson"))
                targetRowNum = i+1;
        }

        System.out.println("---------------------------------------------------------------------");

        List<WebElement> celData = driver.findElements(By.xpath("//table/tbody/tr["+ targetRowNum +"]/td"));

        for (WebElement cell : celData)
            System.out.print(cell.getText() + " ->> ");
    }
}
