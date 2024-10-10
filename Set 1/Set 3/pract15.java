import java.util.Scanner;
public class pract15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b= sc.nextInt();
        Area ar = new Area(l,b);
        int a= ar.returnArea();
        System.out.println("Area of rectangle is:"+a);  
        System.out.println("23DCS086 Mir");
    }
}
class Area{
    int length, breadth;
    Area(int length, int breadth){
        this.length = length;
        this.breadth =breadth;
    }
    int returnArea(){
        return this.length*this.breadth;
    }
}