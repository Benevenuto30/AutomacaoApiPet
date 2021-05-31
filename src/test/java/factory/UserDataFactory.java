package factory;

import pojo.CreateUser;

public class UserDataFactory {

    public static CreateUser createUser(){
        CreateUser createUser = new CreateUser();
        createUser.setId(1);
        createUser.setFirstName("Maria");
        createUser.setLastName("Assunção");
        createUser.setUserName("Maria Assunção");
        createUser.setEmail("maria@email.com");
        createUser.setPhone("123456");
        createUser.setPassword("654321");
        return createUser;
    }

}
