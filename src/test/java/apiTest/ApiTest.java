package apiTest;

import isolatedApi.Store;
import isolatedApi.CreatePet;
import isolatedApi.CreateUser;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void testCreateUser(){

        CreateUser User = new CreateUser();
        User.createUser();

    }

    @Test
    public void testCreatePet(){

        CreatePet Pet = new CreatePet();
        Pet.createPet();

    }

    @Test
    public void testCreateOrder() throws IOException {
        CreateUser User = new CreateUser();
        User.createUser();

        CreatePet Pet = new CreatePet();
        Pet.createPet();

        Store Order = new Store();
        Order.createOrder();
    }

    @Test
    public void testConsultOrder() throws IOException {
        CreateUser User = new CreateUser();
        User.createUser();

        CreatePet Pet = new CreatePet();
        Pet.createPet();

        Store Order = new Store();
        Order.createOrder();

        Store consultOrder = new Store();
        consultOrder.consultOrder();
    }
}
