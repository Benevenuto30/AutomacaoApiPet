package apis;


import factory.OrderDataFactory;
import io.restassured.http.ContentType;
import support.BaseUri;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Store {

    Pet petId = new Pet();
    int id = petId.petId;

    public void createOrder() throws IOException {

        pojo.Order newOrder = new OrderDataFactory().createOrderJson();
        BaseUri uriPetApi = new BaseUri();
        baseURI = uriPetApi.uri;

        given()
                .contentType(ContentType.JSON)
                .body(newOrder)
                .when()
                .post("/store/order")
                .then()
                .assertThat().statusCode(200);

    }

    public void consultOrder (){

        BaseUri uriPetApi = new BaseUri();
        baseURI = uriPetApi.uri;

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/store/order/{id}",1)
                .then()
                .assertThat().statusCode(200).body(
                                            "petId",equalTo(1),
                "status",equalToIgnoringCase("Delivered"));

    }

}
