package apis;

import factory.UserDataFactory;
import io.restassured.http.ContentType;
import support.BaseUri;

import static io.restassured.RestAssured.*;

public class User {

    public String userId;

    public void createUser(){

        pojo.CreateUser createUserMaria = new UserDataFactory().createUser();

        BaseUri uriPetApi = new BaseUri();
        baseURI = uriPetApi.uri;

       this.userId = given()
                .contentType(ContentType.JSON)
                .body(createUserMaria)
        .when()
                .post("/user")
        .then()
                .assertThat().statusCode(200).extract().path("message");
    }

}
