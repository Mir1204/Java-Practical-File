
import java.util.*;
public class pract7 {
    public static void main(String[] args) {   
    System.out.println("Enter a word:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    front_times(str, n);
    System.out.println("\n23DCS086 Mir");
    sc.close();
}
static void front_times(String str, int n) {
    if (str.length() < 3) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    } else {
        for (int i = 0; i < n; i++) {
            System.out.print(str.substring(0, 3));
        }
    
}    
}
}
