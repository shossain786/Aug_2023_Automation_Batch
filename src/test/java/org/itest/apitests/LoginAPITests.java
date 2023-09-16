package org.itest.apitests;

import io.restassured.response.Response;
import org.itest.base.APIBaseTest;
import org.itest.libs.APIEndPoints;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginAPITests extends APIBaseTest {
    Response response;

    @Test(description = "Negative Login Validation with Password missing")
    public void inValidLogin() throws IOException {
        restAssuredUtils.setBasePath(APIEndPoints.LOGIN);
        restAssuredUtils.setAPIPayLoad("InvalidLogin.json");
        response = restAssuredUtils.post();
        Assert.assertEquals(response.statusCode(), 400);
        Assert.assertEquals(restAssuredUtils.getJsonData(response, "error"), "Missing email or username");
        response = null;
    }

}
