package pl.kurs.range;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    // test jednostkowy dotyczy np jednej metody

    // testy jednostkowe MUSZA byc od siebie niezalezne

    // nazwy testów bardzo dokladne

    // czesc wspolna
    private Range r;

    @Before
//    @After
//    @BeforeClass
//    @AfterClass
    public void init() {
        r = new Range(10, 20);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsInTheRange() {
        assertTrue(r.isInTheRange(15));
    }

    @Test
    public void shouldReturnFalseWhenNumberIsOutOfRange() {
        assertFalse(r.isInTheRange(21));
    }

    @Test
    public void shouldReturnCorrectRangeOnGetRangeFrom() {
        int from = r.getRangeFrom();
        assertEquals(10, from);
    }

    @Test
    public void shouldReturnIncorrectRangeOnGetRangeFrom() {
        int from = r.getRangeFrom();
        assertNotEquals(11, from);
    }

    @Test
    public void shouldEqualsTwoDoubles() {
        double a = 4.5;
        double b = 4.6;
        assertEquals(a, b, 0.1);
    }

    @Test
    public void shouldObjectBeNull() {
        Range test = null;
        assertNull(test);
    }

    @Test
    public void shouldObjectNotBeNull() {
        assertNotNull(r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnIllegalArgumnetExceptionWhenRangeIsNotCorrect() {

        Range r = new Range(20, 10);
    }

}