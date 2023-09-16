package org.itest.apitests;

import io.restassured.response.Response;
import org.itest.base.APIBaseTest;
import org.itest.libs.APIEndPoints;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserAPITests extends APIBaseTest {
    Response response;

    @Test(description = "Verification of get list of registered uses.")
    public void getUserList() {
        restAssuredUtils.setBasePath(APIEndPoints.LIST_USERS);
        response = restAssuredUtils.get();
        Assert.assertEquals(response.statusCode(), 200);
        String email = restAssuredUtils.getJsonData(response, "data[0].email");
        Assert.assertEquals(email, "george.bluth@reqres.in");
        response = null;
    }

    @Test(description = "Verification of Single user functionality API")
    public void getSingleUser() {
        restAssuredUtils.setBasePath(APIEndPoints.SINGLE_USER);
        response = restAssuredUtils.get();
        Assert.assertEquals(response.statusCode(), 200);
        String firstName = restAssuredUtils.getJsonData(response, "data.first_name");
        Assert.assertEquals(firstName, "Janet");
        response = null;
    }

    @Test(description = "Verification of Create user functionality!")
    public void createUserTest() throws IOException {
        restAssuredUtils.setBasePath("/api/users");
        restAssuredUtils.setAPIPayLoad("CreateUser.json");
        response = restAssuredUtils.post();
        Assert.assertEquals(response.statusCode(), 201);
        response = null;
    }
}
