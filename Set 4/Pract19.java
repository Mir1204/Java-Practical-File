
import java.util.*;

public class Pract19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] r = new Rectangle[2];
        float l, b, s;
        System.out.print("Enter the length and breadth of the rectangle: ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        System.out.print("Enter length of square");
        s = sc.nextFloat();
        r[0] = new Rectangle(l, b);
        r[1] = new Square(s);
        for (int i = 0; i < 2; i++) {
            r[i].printArea();
            r[i].printPerimeter();
        }
        System.out.println("23DCS086 Mir");
    }

}

class Rectangle {

    float length;
    float breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area :" + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter : " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {

    Square(float side) {
        super(side, side);
    }
}

//this keyword and super keyword should be the first line of code in the block and if any of one will second it will give an error..