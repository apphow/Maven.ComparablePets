package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationTest {

    private String Hamster;
    private String Cat;
    private Object Pet;

    @Test
    public void nameSortTest() {
        Hamster testHamster2 = new Hamster((String) Hamster, "Apple");
        Hamster testHamster = new Hamster(Hamster, "Elvis");
        Cat testCat2 = new Cat(Cat, "Garfield");
        Cat testCat3 = new Cat(Cat, "Jeff");
        Dog testDog2 = new Dog(Cat, "Jeff");
        Dog testDog = new Dog(Cat, "Rex");
        Cat testCat = new Cat(Cat, "Socks");

        //expectedArray made up of pets added in expected order:
        //sort by name first, then by type if names are the same.
        ArrayList<Pet> expectedArray = new ArrayList<Pet>();
        expectedArray.add(testHamster2);
        expectedArray.add(testHamster);
        expectedArray.add(testCat2);
        expectedArray.add(testCat3);
        expectedArray.add(testDog2);
        expectedArray.add(testDog);
        expectedArray.add(testCat);

        ArrayList<Pet> petTestArray = new ArrayList<Pet>();
        petTestArray.add(testCat);
        petTestArray.add(testCat2);
        petTestArray.add(testCat3);
        petTestArray.add(testDog);
        petTestArray.add(testDog2);
        petTestArray.add(testHamster);
        petTestArray.add(testHamster2);

        //Collections.sort(List);
        //expected order should match sort output.
        Assert.assertEquals(expectedArray, petTestArray);
        //The above lines are asking for a List instead of an ArrayList.
        //I think implementing comparable should fix it but
        //if it does not let me know, I can look into it further.
        
    }
}
