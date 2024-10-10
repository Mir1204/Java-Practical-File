import java.util.*;
public class prac11 {
    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String input = sc.next();
        
        if (input.length() > 0) {
            char n = input.charAt(0);
            System.out.println("Length of the string is: " + str.length());
            System.out.println("After replacing 'H' : " + str.replace('H', n));
        } else {
            System.out.println("No character entered.");
        }

        System.out.println("Lowercase of the string is: " + str.toLowerCase());
        System.out.println("23DCS086 Mir");
        sc.close();
    }
}
