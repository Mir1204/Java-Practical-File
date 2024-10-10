import java.util.Scanner;
public class pract11s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        System.out.println("The given string is: " + str);
        char[] strArr = str.toCharArray();
        int[] count = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    count[i]++;
                    strArr[j] = 'x';
                }
            }
        }
        System.out.println("The duplicate characters and counts are:");
        for (int i = 0; i < count.length; i++) {
            if (strArr[i] != 'x' && count[i] > 1) {
                System.out.println(strArr[i] + " appears " + count[i] + " times");
            }
            else{
                System.out.println("No duplicate characters found");
                break;
            }   
        } 

    }
}
