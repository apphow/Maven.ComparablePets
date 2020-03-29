package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class HampsterTest extends Pet {

    @Test
    public void testGetName() {
        Pet pet = new Hampster("hampster", "Apple");
        String expected = "Apple";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Pet pet = new Hampster("hampster", "Elvis");
        String expected = "Squeak, Squeak.";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritanceTest() {
        Hampster TestHampster = new Hampster("hampster", "Earl");
        Assert.assertTrue(TestHampster instanceof Pet);
        Assert.assertTrue(TestHampster instanceof Hampster);

    }
}


