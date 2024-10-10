import java.util.*;
public class prac6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of days for which you want to generate your exercise routine:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("\n23DCS086 Mir");
        sc.close();
    }   
}

