package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FelineTest {

    @Test
    public void unknownShouldHaveExceptionFood() {
        Feline feline = new Feline();
        try {
            feline.getFood("Неизвестный");
        } catch (Exception ex) {
            assertEquals(
                    "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    ex.getMessage());
        }
    }

    @Test
    public void predatorShouldHaveFood() {
        Feline feline = new Feline();
        try {
            assertEquals(
                    List.of("Животные", "Птицы", "Рыба"),
                    feline.getFood("Хищник"));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void herbivoreShouldHaveFood() {
        Feline feline = new Feline();
        try {
            assertEquals(
                    List.of("Трава", "Различные растения"),
                    feline.getFood("Травоядное"));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void felineShouldEatMeat() {
        Feline feline = new Feline();
        try {
            assertEquals(
                    List.of("Животные", "Птицы", "Рыба"),
                    feline.eatMeat());
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void felineShouldGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineShouldHaveFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}