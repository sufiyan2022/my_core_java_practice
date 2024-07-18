package com.ras.immutableclass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Constructor to initialize the fields
    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Create a new list to prevent exposing the internal list
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getters to access the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a copy of the list to prevent modification of the internal list
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    // No setters are provided, making the class immutable
}