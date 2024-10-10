
import java.util.Scanner;

public class pract23 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MyCalculator m = new MyCalculator();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(m.divisor_sum(n));
    }
}

interface Advance_Arithmatic {

    int divisor_sum(int n);

}

class MyCalculator implements Advance_Arithmatic {

    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
