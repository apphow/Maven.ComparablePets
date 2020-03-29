package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

    public class DogTest extends Pet {


        @Test
        public void testGetName() {
            Pet pet = new Pet("dog", "Sylvester");
            String expected = "Sylvester";
            pet.setName(expected);
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
