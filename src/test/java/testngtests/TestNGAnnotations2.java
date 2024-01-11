package testngtests;

import org.testng.annotations.*;

public class TestNGAnnotations2 extends TestBase {
    @BeforeMethod
    public void testSetUP(){
        System.out.println("Inside before method2");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Inside After method2");
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
