import java.util.Scanner;

public class pract4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of days in a month: ");
        int numberOfDays = sc.nextInt();
        
        float dailyExpense[] = new float[numberOfDays];
        
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Enter your daily expense for day " + (i + 1) + ": ");
            dailyExpense[i] = sc.nextFloat();
        }
        
        float totalExpense = 0;
        for (int i = 0; i < numberOfDays; i++) {
            totalExpense += dailyExpense[i];
        }
        
        System.out.println("Total Expense of the month is " + totalExpense);
        
        sc.close(); 
        System.out.println("23DCS086 Mir");
    }
}
