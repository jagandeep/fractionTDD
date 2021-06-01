package org.fraction.arithmetic.add;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Fraction Test
 */
public class FractionTest{
    private Fraction fraction;
    @Before
    public void setup() {
        fraction = new Fraction();
    }
    @Test
    public void shouldAddTwoZeroInteger() {
        assertEquals(0, fraction.add(0,0));
    }

    @Test
    public void shouldAddZeroAndAnInteger() {
        assertEquals(1, fraction.add(0,1));
    }

    @Test
    public void shouldAddAnIntegerAndAnInteger() {
        assertEquals(2
                , fraction.add(1,1));
    }
}
