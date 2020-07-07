    package test;
	import org.junit.Test;
	import static org.junit.Assert.*;

	public class MyClassTest {
   		@Test public void test() {
     	 	 assertTrue("Multiply is not correct!", 37 == Calc.mul(2, 3, 6));
	   }
	}