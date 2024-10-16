import java.util.ArrayList;
class MyStack {
private ArrayList<Object> list = new ArrayList<>();
public boolean isEmpty() {
return list.isEmpty();
}
public int getSize() {
return list.size();
}
public Object peek() {
if (isEmpty()) {
return "Stack is empty";
}
return list.get(list.size() - 1);
}
public Object pop() {
if (isEmpty()) {
return "Stack is empty";
}
return list.remove(list.size() - 1);
}
public void push(Object o) {
list.add(o);
} }
public class pract38 {
public static void main(String[] args) {
MyStack stack = new MyStack();
stack.push(07);
stack.push(69);
stack.push(45);
stack.push(33);
System.out.println("Top element is: " + stack.peek());
System.out.println("Popped element: " + stack.pop());
System.out.println("Is stack empty ? " + stack.isEmpty());
System.out.println("Popped element: " + stack.pop());
System.out.println("Current stack size: " + stack.getSize());
System.out.println("Top element now: " + stack.peek());
System.out.println("23DCS086 Mir");
} }
