package test;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestCalc {
    @Test
    public void TestAdd() {
        assertEquals(5, Calc.add(-5, 10));
    }

    @Test
    public void TestSub() {
        assertEquals(200, Calc.subtract(599, 399));
    }

    @Test
    public void TestMul() {
        assertEquals(100, Calc.multiply(5, 20));
    }

    @Test
    public void TestDiv() {
        assertEquals(3, Calc.divide(10, 3));
    }

    @Test (expected = ArithmeticException.class)
    public void TestDividedByZero() {
        Calc.divide(10, 0);
    }
    
