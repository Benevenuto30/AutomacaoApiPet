package factory;


import pojo.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class OrderDataFactory {

    public static Order createOrder(){
        Order order = new Order();
        order.setId(1);
        order.setShipDate("2021-05-29");
        order.setPetId(1);
        order.setQuantity(1);
        order.setStatus("Delivered");
        order.setComplete(true);
        return order;
    }

    public static Order createOrderJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Order order = objectMapper.readValue(new FileInputStream("src/test/resources/order.json"), Order.class);
        return order;
    }

}
