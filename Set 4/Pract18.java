import java.util.*;
public class Pract18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();
        Manager mn = new Manager();
        System.out.println("Enter details for Employee:");
        e.getdata(s);
        System.out.println("Enter details for Manager:");
        mn.getdata(s);
        System.out.println("Employee details:");
        e.putdata();
        System.out.println("Manager details:");
        mn.putdata();
        s.close();
        System.out.println("23DCS086 Mir");
    }
}

class Member {

    String name;
    int age;
    long phone;
    String address;
    int salary;

    int printSalary() {
        return salary;
    }
}

class Employee extends Member {

    String specialization;

    void getdata(Scanner s) {
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Age: ");
        age = s.nextInt();
        System.out.print("Phone: ");
        phone = s.nextLong();
        s.nextLine(); // Consume newline left-over
        System.out.print("Address: ");
        address = s.nextLine();
        System.out.print("Salary: ");
        salary = s.nextInt();
        s.nextLine(); // Consume newline left-over
        System.out.print("Specialization: ");
        specialization = s.nextLine();
    }

    void putdata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: "+printSalary());
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {

    String department;

    void getdata(Scanner s) {
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Age: ");
        age = s.nextInt();
        System.out.print("Phone: ");
        phone = s.nextLong();
        s.nextLine(); // Consume newline left-over
        System.out.print("Address: ");
        address = s.nextLine();
        System.out.print("Salary: ");
        salary = s.nextInt();
        s.nextLine(); // Consume newline left-over
        System.out.print("Department: ");
        department = s.nextLine();
    }

    void putdata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: "+ printSalary());
        System.out.println("Department: " + department);
    }
}
