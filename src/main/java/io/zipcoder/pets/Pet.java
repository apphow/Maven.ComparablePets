package io.zipcoder.pets;

import io.zipcoder.Animal;

import java.util.ArrayList;

public class Pet implements Comparable<Pet> {
   private String name;
   private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public ArrayList<Pet> getPetTestArray() {
        ArrayList<Pet> petTestArray = null;
        return petTestArray;
    }

    protected Pet() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String speak() {
        return "";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
