package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertDemo {
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
        System.out.println("Test1 started");
        Assert.assertEquals(4,9);
        System.out.println("Test1 completed");
    }
    @Test
    public void test002(){
        System.out.println("Test2 started");
        Assert.assertEquals(4,4);
        System.out.println("Test2 completed");
    }
}
