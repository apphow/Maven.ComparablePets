package io.zipcoder;

import java.util.ArrayList;

public class Pet {
   private String name;
   private String type;
   ArrayList<Pet> petTestArray = new ArrayList<>();

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public ArrayList<Pet> getPetTestArray() {
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
}
