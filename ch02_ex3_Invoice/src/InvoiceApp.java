import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // count of invoices, and total amount, and total discounts
        int count = 0;
        double totalOfAll = 0.0;
        double totalDiscounts = 0.0;
       
        // perform invoice calculations as long as choice isn't equal to "n" or "N"
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();
            totalOfAll += subtotal;

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
            	discountPercent = .25;
            	totalDiscounts += .25;
            }
            else if (subtotal >= 200) {
                discountPercent = .2;
            	totalDiscounts += .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            	totalDiscounts += .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            count += 1;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        // display the total amount invoices and average of all invoices and discounts
        String goodBye = "Total invoices: " + count + "\n"
        				+ "Average Invoice Amount: " + (totalOfAll/count) + "\n"
        				+ "Average Discount Amount: " + (totalDiscounts/count);
        System.out.println(goodBye);
    }
}