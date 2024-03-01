package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
    SoftAssert softAssert;
    @BeforeMethod
    public void beforeTest(){
        System.out.println("inside Before Method");
        softAssert = new SoftAssert();
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("inside after Method");

    }
    @Test
    public void test1(){
        softAssert.assertEquals("Java", "Javaa");
        System.out.println("Test1 started");
        softAssert.assertEquals(4, 9);
        System.out.println("Test1 completed");
        softAssert.assertAll();
    }

    @Test
    public void test2(){
        System.out.println("Test2 started");
        softAssert.assertEquals(4, 4);
        System.out.println("Test2 completed");
        softAssert.assertAll();
    }
}
