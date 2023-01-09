package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    String animalKind;
    List<String> expected;



    public AnimalParameterizedTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;

        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getDataForForm() {


        return new Object[][] {
                {"Травоядное",List.of("Трава", "Различные растения")},
                {"Хищник",List.of("Животные", "Птицы", "Рыба")},


        };
    }
    @Test
    public void genderSelection() throws Exception {
        Animal animal = new Animal();
        List<String> actualHasMane = animal.getFood(animalKind);
assertEquals(expected, actualHasMane);

    }
}