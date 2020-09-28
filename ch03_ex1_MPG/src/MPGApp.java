import java.util.Scanner;
// import java.lang.Math;
import java.math.*;
// import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            // use Math to round
            // double mpg = (double) Math.round((miles/gallons) * 100)/100 ;
          
            // use NumberFormat to round
//            double mpg = miles/gallons;
//            NumberFormat numFormat = NumberFormat.getNumberInstance();
//            numFormat.setMaximumFractionDigits(2);
            
            // use BigDecimal to round
            BigDecimal mpg = new BigDecimal(Double.toString(miles));
            mpg = mpg.divide(new BigDecimal(Double.toString(gallons)), 2, RoundingMode.HALF_UP);
            
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
