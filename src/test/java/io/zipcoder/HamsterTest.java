package io.zipcoder;

import io.zipcoder.pets.Hamster;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class HamsterTest extends Pet {

    @Test
    public void testGetName() {
        Pet pet = new Hamster("hampster", "Apple");
        String expected = "Apple";
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Pet pet = new Hamster("hampster", "Elvis");
        String expected = "Squeak, Squeak.";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritanceTest() {
        Hamster TestHampster = new Hamster("hampster", "Earl");
        Assert.assertTrue(TestHampster instanceof Pet);
        Assert.assertTrue(TestHampster instanceof Hamster);

    }
}

