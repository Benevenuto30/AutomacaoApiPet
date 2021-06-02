package tests;

import apis.Store;
import apis.Pet;
import apis.User;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void testCreateUser(){

        User User = new User();
        User.createUser();

    }

    @Test
    public void testCreatePet(){

        Pet Pet = new Pet();
        Pet.createPet();

    }

    @Test
    public void testCreateOrder() throws IOException {
        User User = new User();
        User.createUser();

        Pet Pet = new Pet();
        Pet.createPet();

        Store Order = new Store();
        Order.createOrder();
    }

    @Test
    public void testConsultOrder() throws IOException {
        User User = new User();
        User.createUser();

        Pet Pet = new Pet();
        Pet.createPet();

        Store Order = new Store();
        Order.createOrder();

        Store consultOrder = new Store();
        consultOrder.consultOrder();
    }
}
