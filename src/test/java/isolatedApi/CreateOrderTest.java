package isolatedApi;


import factory.OrderDataFactory;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;
import pojo.Order;
import support.BaseUri;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class CreateOrderTest {

    //CreatePetTest teste = new CreatePetTest();
    //int a = teste.id;

    @Test
    public void createOrderTest() throws IOException {

        Order order = new OrderDataFactory().createOrderJson();
        BaseUri uri = new BaseUri();
        baseURI = uri.uri;

        given()
                .contentType(ContentType.JSON)
                .body(List<orders>order)
                .when()
                .post("/store/order")
                .then()
                .log().all()
                .assertThat().statusCode(200);

    }

}
