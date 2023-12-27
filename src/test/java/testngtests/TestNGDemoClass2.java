package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemoClass2 {

    @Test()
    public void test_003() {
        System.out.println("Inside Test 003");
        Assert.assertEquals(5, 4);
//        Assert.fail("Failing the test case");
    }
    @Test(dependsOnMethods = "test_003", alwaysRun = true, groups = {"transaction"})
    public void test_004() {
        System.out.println("Inside Test 004");
    }
    @Test(invocationCount = 1, description = "This test doing something", groups = {"login"})
    public void test_005() {
        System.out.println("Inside Test 005");
    }
    @Test(alwaysRun = true, groups = {"sanity"})
    public void test_006() {
        System.out.println("Inside Test 006");
        Assert.assertEquals(3, 10);
    }

    @Test(testName = "Login with Valid Credentials", dependsOnGroups = "sanity")
    public void test_001() {
        System.out.println("Inside Test 001");
    }
    @Test(dependsOnGroups = "sanity")
    public void test_002() {
        System.out.println("Inside Test 002");
    }
}
