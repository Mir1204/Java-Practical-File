import java.util.Arrays;
public class pract39 {
public static <T extends Comparable<T>> void sortArray(T[] array) {
Arrays.sort(array);
}
public static void main(String[] args) {
Integer[] numbers = {3,8,5,2,4};
System.out.println("Before sorting (Integers): " + Arrays.toString(numbers));
sortArray(numbers);
System.out.println("After sorting (Integers): " + Arrays.toString(numbers));
String[] names = {"Mir", "Jay", "Krish", "Mark"};
System.out.println("\nBefore sorting (Strings): " + Arrays.toString(names));
sortArray(names);
System.out.println("After sorting (Strings): " + Arrays.toString(names));
Product[] products = {
new Product("Laptop", 70000),
new Product("Smartwatch", 2500),
new Product("Tablet", 17000),
new Product("Phone", 20000)
};
System.out.println("\nBefore sorting (Products by price): ");
for (Product p : products) {
System.out.println(p);
}
sortArray(products);
System.out.println("\nAfter sorting (Products by price): ");
for (Product p : products) {
System.out.println(p);
} System.out.println("23DCS086 Mir");
}
 }
class Product implements Comparable<Product> {
private String name;
private int price;
public Product(String name, int price) {
this.name = name;
this.price = price;
}
@Override
public int compareTo(Product other) {
return this.price - other.price;
}
@Override
public String toString() {
return name + ": Rs " + price;
} 
}
