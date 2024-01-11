package testngtests;

import org.testng.annotations.*;

public class TestNGAnnotations extends TestBase {
    @BeforeMethod
    public void testSetUP(){
        System.out.println("Inside before method");
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
    public void test_001_1(){
        System.out.println("Inside Test001_1");
    }
    @Test
    public void test_003(){
        System.out.println("Inside Test003");
    }
}
