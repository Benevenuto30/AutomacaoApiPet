package apiTest;

import isolatedApi.CreatePetTest;
import isolatedApi.CreateUserTest;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testCreateUser(){

        CreateUserTest create = new CreateUserTest();
        create.testCreateUser();

    }

    @Test
    public void testCreatePet(){

        CreatePetTest create = new CreatePetTest();
        create.testCreateBrutusPet();

    }
}
