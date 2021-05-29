package isolatedApi;

import factory.PetDataFactory;
import factory.UserDataFactory;
import io.restassured.http.ContentType;
import org.junit.Test;
import pojo.Pet;
import pojo.User;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class CreatePet {
    int id;
    @Test
    public void testCreatePet(){
        baseURI = "https://petstore.swagger.io/v2";

        Pet pet = new PetDataFactory().createPet();

        this.id = given()
                .contentType(ContentType.JSON)
                .body(pet)
        .when()
                .post("/pet")
        .then()
                .extract().path("id");
        System.out.println(id);
    }
}
