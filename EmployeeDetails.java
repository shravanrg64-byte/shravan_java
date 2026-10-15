
class Employee {
   
    private int id;
    private String name;
    private String department;
    private double salary;


    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("-----------------------------------");
        System.out.println("Employee ID    : " + id);
        System.out.println("Name           : " + name);
        System.out.println("Department     : " + department);
        System.out.println("Monthly Salary : $" + salary);
        System.out.println("-----------------------------------");
    }
}


public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Alice Johnson", "Software Engineering", 85000.00);
        Employee emp2 = new Employee(102, "Bob Smith", "Human Resources", 62000.50);

        System.out.println("=== Displaying Employee Details ===");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
