package test;

public class Calc {  
    static public int add (int a, int b)  
    {  
        return a + b;  
  }  
  
    static public int sub (int a, int b)  
    {  
        return a - b;  
  }  
  
    static public int mul (int a, int b)  
    {  
        return a * b;  
  }  
  
    static public int div (int a, int b)  
     {
     if (b == 0) {
           throw new ArithmeticException("Unsolvable");
       }
       else {
           return a / b;
           }
      }
 }
