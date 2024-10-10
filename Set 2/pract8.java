import java.util.*;
public class pract8 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The number of 9's in the array is: " + array_count9(arr));
        System.out.println("23DCS086 Mir");
        sc.close();
    }
    public static int array_count9(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        return count;
    } 
}
