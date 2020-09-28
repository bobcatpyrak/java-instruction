import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        int min = 999;
        int max = 999;
        NumberFormat rounder = NumberFormat.getNumberInstance();
        rounder.setMaximumFractionDigits(1);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
            	if (min == 999)
            		min = testScore;
            	if (max == 999)
            		max = testScore;
                scoreCount++;
                scoreTotal += testScore;
                min = Math.min(min, testScore);
                max = Math.max(max, testScore);
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + rounder.format(averageScore) + "\n"
                + "Highest score: " + max + "\n"
                + "Lowest score: " + min + "\n";
        System.out.println(message);
    }
}