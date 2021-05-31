package factory;

import pojo.CreatePet;

public class PetDataFactory {

    public static CreatePet createPet (){

        CreatePet createPet = new CreatePet();
        createPet.setId(1);
        createPet.setName("Brutus");
        createPet.setBreed("dog");
        return createPet;

    }
}
