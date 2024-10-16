import java.util.*;
public class pract40 {
public static void main(String[] args) {
Map<String, Integer> wordMap = new TreeMap<>();
Scanner sc = new Scanner(System.in);
System.out.print("Enter a text:");
String text = sc.nextLine();
String[] words = text.toLowerCase().split("\\W+");
for (String word : words) {
if (!word.isEmpty()) {
wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
} }
System.out.println("\nWord Occurrences (in alphabetical order):");
Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();
for (Map.Entry<String, Integer> entry : entrySet) {
System.out.println(entry.getKey() + ": " + entry.getValue());
} 
System.out.println("23DCS086 Mir");
} }
