package Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    ModulusCalculator c;

    @BeforeEach
    void setUp()
    {
        c= new ModulusCalculator();
    }

    @Test
    void CalcTester()
    {

        assertTrue(c.add(3));
        assertTrue(c.add(5));
        assertTrue(c.add(7));
        assertTrue(c.add(11));
        assertTrue(c.add(13));
        assertTrue(c.add(17));
        assertTrue(c.add(809));

        assertFalse(c.add(1152));
        assertFalse(c.add(4));
        assertFalse(c.add(8));
        assertFalse(c.add(594));

    }
}