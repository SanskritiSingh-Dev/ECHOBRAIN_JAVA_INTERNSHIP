package CUSTOM_EXCEPTION;

/* Product Price Validation
Create class InvalidPriceException
 Price should be &gt; 0
 Throw exception if invalid*/

import java.util.Scanner;

class InvalidPriceException extends Exception {

    public InvalidPriceException(String message) {
        super(message);
    }
}
public class ProductPriceValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter product price:");
            double price = sc.nextDouble();
            if (price <= 0) {
                throw new InvalidPriceException("Invalid price. Please enter a price above 0.");
            } else {
                System.out.println("Valid price entered: " + price);
            }
        } catch (InvalidPriceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
