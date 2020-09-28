import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) 
        {
            // get the input from the user
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
//            System.out.print("Enter yearly interest rate: ");
//            double interestRate = sc.nextDouble();
            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();

            // convert yearly values to monthly values
/*            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;

            // use a for loop to calculate the future value
            double futureValue = 0.0;
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) * 
                              (1 + monthlyInterestRate);
            }*/

            // format the result and display it to the user
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(1);
          /*  System.out.println("Future value:               "
                    + currency.format(futureValue));
            System.out.println();*/
            System.out.print("Year");
            for (double interestRate = .05; interestRate < .07; interestRate += .005)
            {
            	System.out.print("\t" + percent.format(interestRate));	
            }
            System.out.println();
            
            for (int i = 1; i <= years; i++)
            {
            	System.out.print(i);
                for (double interestRate = .05; interestRate < .07; interestRate += .005)
                {
                	double monthlyInterestRate = interestRate / 12;
                    int months = 12 * i;

                    // use a for loop to calculate the future value
                    double futureValue = 0.0;
                    for (int ii = 1; ii <= months; ii++) 
                    {
                        futureValue = (futureValue + monthlyInvestment) * 
                                      (1 + monthlyInterestRate);
                    }
                	System.out.print("\t" + currency.format(futureValue));	
                }
                System.out.println();
            }
            
            // see if the user wants to continue
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}