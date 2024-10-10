public class pract17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        c.print();
        c.Print();
        System.out.println("23DCS086_Mir");
    }
}
class Parent {
    void print() {
        System.out.println("This is Parent class");
    }
}
class Child extends Parent {
    void Print() {
        System.out.println("This is Child class");
    }
}