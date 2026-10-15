import java.util.Scanner;

public class Main {
    int x;

    public static void main(String[] args) {
      
        Main MyObj = new Main();
        
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        MyObj.x = scanner.nextInt();
       
        System.out.println("The value of x is: " + MyObj.x);
        
        scanner.close();
    }
}
