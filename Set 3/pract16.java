import java.util.Scanner;

public class pract16 {
     public static void main(String[] args) {
        int[] real = new int[2]; 
        int[] complex = new int[2]; 
        Scanner sc= new Scanner(System.in);
            for (int i =0 ; i<2; i++){
                System.out.print("Enter Real part of complex number "+(i+1)+": ");
                real[i] = sc.nextInt();
                System.out.print("Enter Imaginary part of complex number "+(i+1)+": ");
                complex[i] = sc.nextInt();
            }
            Complex c1 = new Complex(real[0], complex[0]);
            Complex c2 = new Complex(real[1], complex[1]);
            System.out.println("Sum: ");
            c1.add(c2);
            System.out.println("Difference: ");
            c1.subtract(c2);
            System.out.println("Product: ");
            c1.multiply(c2);
            System.out.println("23DCS086 Mir");
     }
}
class Complex{
    int real, imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void add(Complex c){
        System.out.println((this.real+c.real)+" + "+(this.imaginary+c.imaginary)+"i");
    }
    void subtract(Complex c){
        System.out.println((this.real-c.real)+" + "+(this.imaginary-c.imaginary)+"i");
    }
    void multiply(Complex c){
        System.out.println((this.real*c.real - this.imaginary*c.imaginary)+" + "+(this.real*c.imaginary + this.imaginary*c.real)+"i");
    }
}
