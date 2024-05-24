package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScoreTest {

    private StudentScoreCalculator calculator;

    @Before
    public void setUp() {
        calculator = new StudentScoreCalculator();
    }

    @Test
    public void testSatScore() {
        calculator.calcsat(50, 50);
        assertEquals(2500, calculator.GetSatScore());
    }

    @Test
    public void testSatScoreNegative() {
        calculator.calcsat(-1, 50);
        assertEquals(-1, calculator.GetSatScore());
    }
}
