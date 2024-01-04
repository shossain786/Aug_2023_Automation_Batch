package testngtests;

import org.testng.annotations.*;

public class TestNGAnnotations {

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

    @BeforeMethod
    public void testSetUP(){
        System.out.println("Inside before method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Inside before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Inside after suite");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Inside After method");
    }
    @Test
    public void test_001(){
        System.out.println("Inside Test001");
    }
    @Test
    public void test_002(){
        System.out.println("Inside Test002");
    }
    @Test
    public void test_003(){
        System.out.println("Inside Test003");
    }
}
