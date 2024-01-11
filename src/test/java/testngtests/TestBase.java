package testngtests;

import org.testng.annotations.*;

public class TestBase {
    @BeforeMethod
    public void beforeMethodBaseClass(){
        System.out.println("Before method from Parent class");
    }
    @AfterMethod
    public void afterMethodBaseClass(){
        System.out.println("After method from Parent class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Inside before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Inside after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Inside after Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Inside before class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Inside after class");
    }


}
