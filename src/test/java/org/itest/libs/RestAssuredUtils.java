package org.itest.libs;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class RestAssuredUtils {
    Logger logger = LogManager.getLogger(RestAssuredUtils.class);

    String payLoad;

    public void setBaseURI() {
        RestAssured.baseURI = APIEndPoints.BASE_URI;
    }

    public void setBasePath(String basePath) {
        RestAssured.basePath = basePath;
    }

    public void resetBaseURI() {
        RestAssured.baseURI = null;
    }

    public void resetBasePath() {
        RestAssured.basePath = "";
    }

    public void setContentType(String contentType) {
        given().contentType(contentType);
    }

    public Response get() {
        Response response = given().get();
        logger.debug("Response JSON: \n" + response.prettyPrint());
        return response;
    }

    public void setAPIPayLoad(String fileName) throws IOException {
        payLoad = "";
        payLoad = Files.readString(Paths.get(APIEndPoints.PAYLOAD_DIR + fileName));
    }

    public Response post() {
        logger.debug("PayLoad to be used: \n" + payLoad);
        Response response = given().body(payLoad).post();
        logger.debug("Response from the post request: \n" + response.asPrettyString());
        return  response;
    }

    public String getJsonData(Response response, String jsonPath) {
        return new JsonPath(response.asString()).getString(jsonPath);
    }
}
