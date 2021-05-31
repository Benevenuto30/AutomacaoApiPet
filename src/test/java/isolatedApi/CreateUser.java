package isolatedApi;

import factory.UserDataFactory;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;
import pojo.User;
import support.BaseUri;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CreateUser {

    @Before
    public void setup(){
        baseURI = "https://petstore.swagger.io/v2";
    }


    public void createUser(){
        User user = new UserDataFactory().createUser();

        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        given()
                .contentType(ContentType.JSON)
                .body(user)
        .when()
                .post("/user")
        .then()
                .assertThat().statusCode(200);
    }

}