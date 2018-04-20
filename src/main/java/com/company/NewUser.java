package com.company;

import com.github.javafaker.Faker;

import java.util.Random;

public class NewUser {


    Faker faker = new Faker();
    Random random = new Random();

    String email;
    String firstName;
    String lastName;
    String city;
    String country;
    String myId;

    public NewUser() {

        firstName = faker.name().firstName();
        lastName =  faker.name().lastName();
        city = faker.address().city();
        country = faker.address().country();
        myId = String.format("%09d", random.nextInt(1000000000));
        email = firstName + "." + lastName + "@company.com";

        System.out.println(email + ", " + firstName + ", " + lastName + ", " + city + ", " + country + ", " + myId);
    }
}
