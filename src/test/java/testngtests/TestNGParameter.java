package testngtests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter extends TestBase{

    @Test
    @Parameters("url")
    public void test_method001(String urlName) {
        System.out.println("Inside Test Method1");
        System.out.println("Parameter value: " + urlName);
    }

    @Test
    @Parameters({"url","browser"})
    public void test_method002(String urlValue, @Optional("chrome") String browserValue) {
        System.out.println("Inside Test Method2");
        System.out.println("url: " + urlValue + "\nBrowser: " + browserValue);
    }
}
