package isolatedApi;

import factory.PetDataFactory;
import io.restassured.http.ContentType;
import pojo.Pet;
import support.BaseUri;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CreatePet {
    public int id;

    public void createPet(){
        Pet pet = new PetDataFactory().createPet();

        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        this.id =  given()
                .contentType(ContentType.JSON)
                .body(pet)
        .when()
                .post("/pet")
        .then()
                .assertThat().statusCode(200).body("name", equalTo("Brutus"))
                .extract().path("id");
    }
}
