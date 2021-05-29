package factory;

import pojo.Pet;

public class PetDataFactory {

    public static Pet createPet (){

        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("Brutus");
        pet.setBreed("dog");
        return pet;

    }
}
