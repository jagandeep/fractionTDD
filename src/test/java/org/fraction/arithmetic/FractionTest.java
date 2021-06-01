package org.fraction.arithmetic;

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
}
