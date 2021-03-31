package org.decagon.francis;

/**
 * Created by Francis Oyiogu on 30/03/2021.
 *
 * Abstract Class of Person
 */

public abstract class Person {

    //Fields for the person class

    private String name;
    private Gender gender;

    //Constructor for the person class

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    //Getters

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
