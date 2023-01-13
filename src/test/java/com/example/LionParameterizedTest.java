package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    String sex;
    boolean expected;
    Feline feline;



    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getDataForForm() {


        return new Object[][] {
                {"Самец", true},
                {"Самка", false},


        };
    }
    @Test
    public void genderSelection() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expected, actualHasMane);
    }
}