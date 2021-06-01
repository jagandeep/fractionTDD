package org.fraction.arithmetic.add;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Fraction Test
 */
public class FractionTest{

    @Test
    public void shouldAddTwoZeroInteger() {
        Fraction fraction = new Fraction();
        assertEquals(0, fraction.add(0,0));
    }

    @Test
    public void shouldAddZeroAndAnInteger() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.add(0,1));
    }

    @Test
    public void shouldAddAnIntegerAndAnInteger() {
        Fraction fraction = new Fraction();
        assertEquals(2
                , fraction.add(1,1));
    }
}
