package io.zipcoder;

import org.junit.Before;

package io.zipcoder.pets;

import io.zipcoder.polymorphism.Animal;
import org.junit.Assert;
import org.junit.Test;

public class CatTest extends Pet {


    @Test
    public void testGetName() {
        Pet pet = new Cat("cat", "Sylvester");
        String expected = "Sylvester";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Pet pet = new Cat("cat", "Socks");
        String expected = "Meow!";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritanceTest() {
        Cat TestCat = new Cat("cat", "Fluffy");
        Assert.assertTrue(TestCat instanceof Pet);
        Assert.assertTrue(TestCat instanceof Cat);

    }


}
