package test;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionDemo {

    @BeforeMethod
    public void beforeTest(){
        System.out.println("inside Before Method");
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("inside after Method");
    }
    @Test
    public void test1(){
        System.out.println("Test1 started");
        Assert.assertEquals(3, 0);
        System.out.println("Test1 completed");

    }

    @Test
    public void test2(){
        System.out.println("Test2 started");
        Assert.assertEquals(5, 5);
        System.out.println("Test2 completed");

    }
}
