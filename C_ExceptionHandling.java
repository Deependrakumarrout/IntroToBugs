package IntroToBugs;

public class C_ExceptionHandling {
 public static void main(String[] args){
     // Here i am using try:catch keyword to avoid error.

     try {
         int num1 = 0, num2 = 40;
         int div = num2 / num1;
         System.out.println(div);
     }catch(Exception e) {
      System.out.println("Arithmetic Exception: " + e.getMessage());
     }
    }
}
