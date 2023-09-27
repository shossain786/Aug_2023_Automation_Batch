import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APISampleTest {


    @Test
    public void testAPI() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "api/users?page=2";
        RestAssured.given().contentType("application/json");
        Response response = RestAssured.get();
        System.out.println(response.statusCode());
        System.out.println(response.getBody().prettyPrint());
    }
}


//WebDriver driver = new FirefoxDriver();