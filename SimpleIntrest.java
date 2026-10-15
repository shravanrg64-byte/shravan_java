import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();


        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();


        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();

       
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n--- Results ---");
        System.out.println("Principal Amount  : " + principal);
        System.out.println("Interest Rate     : " + rate + "%");
        System.out.println("Time Period       : " + time + " years");
        System.out.println("Simple Interest   : " + simpleInterest);
        System.out.println("Total Amount (P+I): " + (principal + simpleInterest));

        scanner.close();
    }
}
