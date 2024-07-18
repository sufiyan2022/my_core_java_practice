package com.ras.immutableclass;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("Reading", "Gaming", "Hiking");
        ImmutablePerson person = new ImmutablePerson("John Doe", 30, hobbies);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Hobbies: " + person.getHobbies());

        // Trying to modify the hobbies list
//        person.getHobbies().add("Swimming");  // This will not affect the internal hobbies list

        System.out.println("Hobbies after attempt to modify: " + person.getHobbies());
    }
}
