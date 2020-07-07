## Test Calc class
```Java
  import com.ict6.oop.calc;
  import org.junit.Test;
  import static org.junit.Assert.*;

  public class CalcTest {
    @Test 
    public void testSubstract(){
        assertTrue("Calc substract incorrect", -1 == calc.substract(2,3));
        assertTrue("Calc substract incorrect", 5 == calc.substract(10,4));
    }
  }
```
