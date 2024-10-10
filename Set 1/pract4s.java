import java.util.*;
public class pract4s {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the fiction array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fiction = new int[n];
        System.out.println("Enter the elements of the fiction array:");
        for (int i = 0; i < n; i++) {
            fiction[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the non-fiction array:");
        int m = sc.nextInt();
        int[] nonfiction = new int[m];
        System.out.println("Enter the elements of the non-fiction array:");
        for (int i = 0; i < m; i++) {
            nonfiction[i] = sc.nextInt();
        }
        int[] inventory = merge(fiction, nonfiction);
        System.out.println("The merged array is:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(inventory[i] + " ");
        }
        sc.close();
    }
    public static int[] merge(int[] fiction, int[] nonfiction) {
        int[] inventory = new int[fiction.length + nonfiction.length];
        for (int i = 0; i < fiction.length; i++) {
            inventory[i] = fiction[i];
        }
        for (int i = 0; i < nonfiction.length; i++) {
            inventory[fiction.length + i] = nonfiction[i];
        }
        return inventory;
    }
}
