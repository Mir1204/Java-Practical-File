
import java.util.*;
public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        System.out.println("Length of the string is: " + str.length());
        System.out.println("Lowercase of the string is: " + str.toLowerCase());
        System.out.println("Uppercase of the string is: " + str.toUpperCase());
        System.out.println("Reverse of the string is: " + reverse(str));
        System.out.println("Sorted string is: " + sort(str));
        System.out.println("23DCS086 Mir");

    }
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static String sort(String str) {
        char[] arr =str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }
}

