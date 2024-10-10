import java.util.*;
public class prac5 {
    public static void main(String[] args) {
        int[] price = {1000,2000,3000,4000,5000};
        int total =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("1 for motor");
        System.out.println("2 for fan");
        System.out.println("3 for tube");
        System.out.println("4 for wires");
        System.out.println("5 for all other items");
        int i = sc.nextInt();
        switch(i)
            {
                case 1:
                System.out.println("The price with tax are "+ (price[0]+price[0]*0.08f));
                break;
                
                case 2:
                System.out.println("The price with tax are "+ (price[1]+price[1]*0.12f));
                break;
    
                case 3:
                System.out.println("The price with tax are "+ (price[2]+price[2]*0.05f));
                break;
    
                case 4:
                System.out.println("The price with tax are "+ (price[3]+price[3]*0.075f));
                break;
    
                case 5:
                System.out.println("The price with tax are "+ (price[4]+price[4]*0.03f));
                break;
                default:
                System.out.println("Wrong input");
                    break;
            }
        System.out.println("23DCS086 Mir");
        
        }
    
    }
