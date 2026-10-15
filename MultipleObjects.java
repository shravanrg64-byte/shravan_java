import java.util.ArrayList;
import java.util.List;


class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        
  
        System.out.println("--- Method 1: Individual Objects ---");
        Product prod1 = new Product("Laptop", 999.99);
        Product prod2 = new Product("Smartphone", 499.99);
        
    
        prod1.display();
        prod2.display();


 
        System.out.println("\n--- Method 2: Dynamic Objects using a Loop ---");
        
       
        List<Product> productList = new ArrayList<>();
    
        String[] productNames = {"Headphones", "Keyboard", "Mouse", "Monitor"};
        double[] productPrices = {79.99, 45.00, 25.50, 180.00};


        for (int i = 0; i < productNames.length; i++) {
            productList.add(new Product(productNames[i], productPrices[i]));
        }


        for (Product prod : productList) {
            prod.display();
        }
    }
}
