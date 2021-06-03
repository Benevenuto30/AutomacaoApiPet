package tests;

import apis.Store;
import apis.Pet;
import apis.User;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void testCreateUser(){

        User UserMaria = new User();
        UserMaria.createUser();

    }

    @Test
    public void testCreatePet(){

        Pet PetBrutus = new Pet();
        PetBrutus.createPet();

    }

    @Test
    public void testCreateOrder() throws IOException {
        User UserMaria = new User();
        UserMaria.createUser();

        Pet PetBrutus = new Pet();
        PetBrutus.createPet();

        Store OrderToMaria = new Store();
        OrderToMaria.createOrder();
    }

    @Test
    public void testConsultOrder() throws IOException {
        User UserMaria = new User();
        UserMaria.createUser();

        Pet PetBrutus = new Pet();
        PetBrutus.createPet();

        Store OrderToMaria = new Store();
        OrderToMaria.createOrder();

        Store consultOrderToMaria = new Store();
        consultOrderToMaria.consultOrder();
    }
}
