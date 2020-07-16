// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// JUnit for Calc.java

import org.junit.*;
import static org.junit.Assert.*;

public class CalcTest
{
    @Test
    public void testAdd()
    {
        assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
    }

    @Test
    public void testSub(){
        assertTrue("The difference is incorrect", 20 == Calc.sub(50,30));
    }
}