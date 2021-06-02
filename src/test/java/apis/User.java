package apis;

import factory.UserDataFactory;
import io.restassured.http.ContentType;
import support.BaseUri;

import static io.restassured.RestAssured.*;

public class User {

    public String userId;

    public void createUser(){
        pojo.CreateUser createUser = new UserDataFactory().createUser();

        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

       this.userId = given()
                .contentType(ContentType.JSON)
                .body(createUser)
        .when()
                .post("/user")
        .then().log().all()
                .assertThat().statusCode(200).extract().path("message");
        System.out.println(userId);
    }

}
