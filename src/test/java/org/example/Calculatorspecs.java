package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Calculatorspecs {
    Calculator calc = new Calculator();

    @Test
    public void Assert() {
        Assertions.assertEquals(4, calc.add(2, 2));
        Assertions.assertNotEquals(2, calc.add(3, 2));

    }

    @Test

    public void NotNull() {
        String f = null;
        String e = "abc";
        Assertions.assertNotNull(e);

    }

    @Test
    public void truefalse(){
        boolean t = true;
        boolean f = false;
        Assertions.assertTrue(t);
        Assertions.assertFalse(f);
    }
    @Test
    public void ArrayEqual(){
        int[] a = {1,3,3,4,5};
        int [] b = {1,3,3,4,5};
        Assertions.assertArrayEquals(a,b);

    }



}