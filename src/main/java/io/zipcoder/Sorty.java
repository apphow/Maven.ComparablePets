package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class Sorty implements Comparator<Pet> {

    public int compare(Pet one, Pet two) {
        if (one.getClass().getName().equalsIgnoreCase(two.getClass().getName())) {
            return one.getName().compareTo(two.getName());

        } else {
            System.out.println(one.getClass().getName());
            return one.getClass().getName().compareTo(two.getClass().getName());

        }
    }
}

