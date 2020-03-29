package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Hamster;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String petType, petName;
        ArrayList<Pet> petArrayList = new ArrayList<Pet>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();

        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What kind of pet?");
            petType = scanner.next();
            System.out.println("Enter pet's name.");
            petName = scanner.next();
            if ("dog".equals(petType.toLowerCase())) {
                petArrayList.add(new Dog(petType, petName));
            } else if ("cat".equals(petType.toLowerCase())) {
                petArrayList.add(new Cat(petType, petName));
            } else if ("hampster".equals(petType.toLowerCase())) {
                petArrayList.add(new Hamster(petType, petName));
            }
        }
        for (Pet petObj : petArrayList) {
            System.out.println(petObj.getName() + " " + petObj.speak());
        }
    }
}
