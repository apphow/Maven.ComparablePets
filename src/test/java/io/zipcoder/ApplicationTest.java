package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Hamster;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {

    private String Hamster;
    private String Cat;
    private Object Pet;

    @Test
    public void nameSortTest() {
        io.zipcoder.pets.Hamster testHamster2 = new Hamster((String) Hamster, "Apple");
        Hamster testHamster = new Hamster(Hamster, "Elvis");
        Cat testCat2 = new Cat(Cat, "Garfield");
        Cat testCat3 = new Cat(Cat, "Jeff");
        Dog testDog2 = new Dog(Cat, "Jeff");
        Dog testDog = new Dog(Cat, "Rex");
        io.zipcoder.pets.Cat testCat = new Cat(Cat, "Socks");

        //expectedArray made up of pets added in expected order:
        //sort by name first, then by type if names are the same.
        ArrayList<io.zipcoder.pets.Pet> expectedArray = new ArrayList<Pet>();
        expectedArray.add(testHamster2);
        expectedArray.add(testHamster);
        expectedArray.add(testCat2);
        expectedArray.add(testCat3);
        expectedArray.add(testDog2);
        expectedArray.add(testDog);
        expectedArray.add(testCat);

        ArrayList<Pet> petTestArray = new ArrayList<>();
        petTestArray.add(testCat);
        petTestArray.add(testCat2);
        petTestArray.add(testCat3);
        petTestArray.add(testDog);
        petTestArray.add(testDog2);
        petTestArray.add(testHamster);
        petTestArray.add(testHamster2);

        Collections.sort(expectedArray);
        //Collections.sort(petTestArray, expectedArray);
        //expected order should match sort output.
        Assert.assertEquals(expectedArray, petTestArray);
        //The above lines are asking for a List instead of an ArrayList.
        //I think implementing comparable should fix it but
        //if it does not let me know, I can look into it further.
        
    }
}
