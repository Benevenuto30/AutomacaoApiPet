package isolatedApi;

import factory.PetDataFactory;
import io.restassured.http.ContentType;
import pojo.CreatePet;
import support.BaseUri;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Pet {
    public int petId;

    public void createPet(){
        CreatePet createPet = new PetDataFactory().createPet();

        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        this.petId =  given()
                .contentType(ContentType.JSON)
                .body(createPet)
        .when()
                .post("/pet")
        .then()
                .assertThat().statusCode(200).body("name", equalTo("Brutus"))
                .extract().path("id");
    }
}
