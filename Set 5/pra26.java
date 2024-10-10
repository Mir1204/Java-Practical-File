//Write a Java program that throws an exception and catch
//it using a try-catch block.
public class pra26 {
  public static void main(String[] args) {
    
    try {
      throw new ArithmeticException("This is an exception");
    } catch (ArithmeticException e) {
      System.out.println("Exception caught");
    }

    System.out.println("23DCS086 Mir");
  }  
}
