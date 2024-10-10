public class pract13 {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 5000.0);
        Employee emp2 = new Employee("Jane", "Smith", 6000.0);

        // Display each employee's yearly salary
        System.out.println("Yearly Salary for " + emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.yearlySalary());
        System.out.println("Yearly Salary for " + emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.yearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise(emp1.getMonthlySalary() * 0.10);
        emp2.giveRaise(emp2.getMonthlySalary() * 0.10);

        // Display each employee's yearly salary after raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Yearly Salary for " + emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.yearlySalary());
        System.out.println("Yearly Salary for " + emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.yearlySalary());
        System.out.println("23DCS086 Mir");
    }
}