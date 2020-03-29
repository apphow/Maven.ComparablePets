package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {
    @Test
    public void nameSortTest() {
        Hamster testHamster2 = new Hamster(hamster, Apple);
        Hamster testHamster = new Hamster(hamster, Elvis);
        Cat testCat2 = new Cat(cat, Garfield);
        Cat testCat3 = new Cat(cat, Jeff);
        Dog testDog2 = new Dog(dog, Jeff);
        Dog testDog = new Dog(dog, Rex);
        Cat testCat = new Cat(cat, Socks);

        //expectedArray made up of pets added in expected order:
        //sort by name first, then by type if names are the same.
        ArrayList<pet> expectedArray = new ArrayList<pet>();
        expectedArray.add(testHamster2);
        expectedArray.add(testHamster);
        expectedArray.add(testCat2);
        expectedArray.add(testCat3);
        expectedArray.add(testDog2);
        expectedArray.add(testDog);
        expectedArray.add(testCat);

        ArrayList<pet> petTestArray = new ArrayList<pet>();
        petTestArray.add(testCat);
        petTestArray.add(testCat2);
        petTestArray.add(testCat3);
        petTestArray.add(testDog);
        petTestArray.add(testDog2);
        petTestArray.add(testHamster);
        petTestArray.add(testHamster2);

        Collections.sort(petTestArray);
        //expected order should match sort output.
        Assert.assertEquals(expectedArray, petTestArray);
        //The above lines are asking for a List instead of an ArrayList.
        //I think implementing comparable should fix it but
        //if it does not let me know, I can look into it further.
        
    }
}
