package apis;

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
        CreatePet createPetBrutus = new PetDataFactory().createPet();

        BaseUri uriPetApi = new BaseUri();
        baseURI = uriPetApi.uri;

        this.petId =  given()
                .contentType(ContentType.JSON)
                .body(createPetBrutus)
        .when()
                .post("/pet")
        .then()
                .assertThat().statusCode(200).body("name", equalTo("Brutus"))
                .extract().path("id");
    }
}
