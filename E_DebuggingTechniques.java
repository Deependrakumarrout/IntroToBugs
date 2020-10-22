package IntroToBugs;
import java.util.*;
public class E_DebuggingTechniques {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);

        System.out.println("Area Calculator");
        while (true) {
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println();

            System.out.print("Please enter your choice: ");
            int choice = keyword.nextInt();

            if (choice == 1)
                areaOfTriangle(4, 5);
            else if (choice == 2)
                areaOfRectangle(6, 4);
            else if (choice == 3)  // Over here in the codeAcademy it was 2. So we find and fix it as it called logic error.
                areaOfCircle(7);
            else if (choice == 4) {
                quit();
                break;
            } else
                System.out.println("Invalid input.");
        }
    }

    public static void areaOfTriangle(int side1, int side2 ){
        Scanner option = new Scanner(System.in);

        System.out.print("Enter the 1st side: ");
        side1 = option.nextInt();
        System.out.print("Enter the 2nd side: ");
        side2 = option.nextInt();
        int calculation = (side1*side2)*2;
        System.out.println("The area of Triangle is: "+ calculation);
        //return calculation;
    }

    public static void areaOfRectangle(int len, int brh){
        Scanner option = new Scanner(System.in);
        System.out.print("Enter the length: ");
        len = option.nextInt();
        System.out.print("Enter the breath: ");
        brh = option.nextInt();
        int calculation = len*brh;
        System.out.println("The area of Rectangle is: " + calculation);
    }

    public static void areaOfCircle(double radius){
        Scanner option = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = option.nextInt();
        double operation = Math.PI  *radius * radius;
        System.out.println("The area of the circle is: "+ operation);
    }

    public static void quit(){
        System.out.println("Have a nice day...");
    }

}
