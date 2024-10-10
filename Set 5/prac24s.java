
import java.util.Scanner;

public class prac24s {

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();

        try {
            int z = x / y;
            System.out.println("Division is " + z);
        } catch (Exception e) {
            System.out.println("Division by zero is not possible");
        }
        System.out.println("23DCS086 Mir");
    }
}
