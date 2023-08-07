package com.np.designpatterns.builder;

import java.util.Date;

public class UserTest {

    public static void main(String[] args) {
        User user = User.newBuilder()
                .withFirstName("John")
                .withLastName("Doe")
                .withUsername("jdoe")
                .withEmail("jdoe@gmail.com")
                .withBirthDate(new Date())
                .withActive(false)
                .build();

        System.out.println("User: " + user);
    }
}
