package IntroToBugs;

public class D_LogicError {
    /*
    Run D_LogicError.java. There should be no error messages.
    But the program is supposed to output steps from #1 - #10. The program is somehow starting from 0…
    Find the logic error.
     */
    public static void main(String[] args){
     for(int i=1;i<=10;i++) // So here is the logic here.Because i=0, so our program run from starting point 0 lets change it to 1.
         System.out.println("step #" + i);

    }
}
