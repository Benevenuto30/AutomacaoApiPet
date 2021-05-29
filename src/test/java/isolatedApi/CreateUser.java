package isolatedApi;

import factory.UserDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.User;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CreateUser {
    @Test
    public void testCreateUser(){
        baseURI = "https://petstore.swagger.io/v2";

        User user = new UserDataFactory().createUser();

        given()
                .contentType(ContentType.JSON)
                .body(user)
        .when()
                .post("/user")
        .then()
                .log().all();
    }

}
