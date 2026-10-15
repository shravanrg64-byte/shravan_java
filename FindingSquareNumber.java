import java.util.Scanner;

public class SquareRootExample {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.util.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

   
        if (number < 0) {
            System.out.println("Cannot calculate the square root of a negative number (returns NaN).");
        } else {
        
            double squareRoot = Math.sqrt(number);

     
            System.out.println("The square root of " + number + " is: " + squareRoot);
        }

        scanner.close();
    }
}
