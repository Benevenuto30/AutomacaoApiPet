package isolatedApi;


import factory.OrderDataFactory;
import io.restassured.http.ContentType;
import support.BaseUri;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Store {

    //CreatePetTest teste = new CreatePetTest();
    //int a = teste.id;


    public void createOrder() throws IOException {

        pojo.Order order = new OrderDataFactory().createOrderJson();
        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        given()
                .contentType(ContentType.JSON)
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .assertThat().statusCode(200);

    }

    public void consultOrder (){

        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/store/order/{id}",1)
                .then().log().all()
                .assertThat().statusCode(200).body(
                                            "petId",equalTo(1),
                "status",equalToIgnoringCase("Delivered"));

    }

}
