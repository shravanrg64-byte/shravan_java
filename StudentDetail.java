import java.util.Scanner;


class Student {
   
    private int rollNumber;
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

   
    public Student(int rollNumber, String name, double marks1, double marks2, double marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

  
    public double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

  
    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

   
    public void displayDetails() {
        System.out.println("\n----------------------------------");
        System.out.println("         STUDENT DETAILS          ");
        System.out.println("----------------------------------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Subject 1   : " + marks1);
        System.out.println("Subject 2   : " + marks2);
        System.out.println("Subject 3   : " + marks3);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.printf("Percentage  : %.2f%%\n", calculatePercentage());
        System.out.println("----------------------------------");
    }
}


public class StudentDetailsManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Student Information ---");
        
      
        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Marks for Subject 1: ");
        double m1 = scanner.nextDouble();
        
        System.out.print("Enter Marks for Subject 2: ");
        double m2 = scanner.nextDouble();
        
        System.out.print("Enter Marks for Subject 3: ");
        double m3 = scanner.nextDouble();

       
        Student student = new Student(roll, name, m1, m2, m3);

        
        student.displayDetails();

      
        scanner.close();
    }
}
