package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo2 {
    SoftAssert softAssert;
    @BeforeMethod
    public void method1(){

        System.out.println("Inside Before Method");
    }
    @AfterMethod
    public void method2(){
        System.out.println("Inside After Method");
    }

    @Test
    public void test001(){
        softAssert = new SoftAssert();
        System.out.println("Test1 started");
        softAssert.assertEquals(4, 9);
        System.out.println("-------------------");
        softAssert.assertEquals("Java", "java");
        System.out.println("Test1 completed");
        softAssert.assertAll();
    }
    @Test
    public void test002(){
        softAssert = new SoftAssert();
        System.out.println("Test2 started");
        softAssert.assertEquals(4,4);
        System.out.println("Test2 completed");
        softAssert.assertAll();
    }
}
