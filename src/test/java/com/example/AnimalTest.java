package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Spy
    Animal animal;

    //Проверка, что ожидание появляется
    @Test(expected = Exception.class)
    public void herbivoreСhoiceTest() throws Exception {
        Animal animal = new Animal();
        animal.getFood("ауыа");
    }

    //Проверка сообщения ожидания
    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("ауыа");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
}
    @Test
    public void getFamilyAnimalPositiveTest() throws Exception {

        String expectedR = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualR = animal.getFamily();
        assertEquals(expectedR,actualR);
    }


}

