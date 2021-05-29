package factory;

import pojo.User;

public class UserDataFactory {

    public static User createUser(){
        User user = new User();
        user.setId(1);
        user.setFirstName("Maria");
        user.setLastName("Assunção");
        user.setUserName("Maria Assunção");
        user.setEmail("maria@email.com");
        user.setPhone("123456");
        user.setPassword("654321");
        return user;
    }

}
