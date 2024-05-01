import java.util.Scanner;

public class SortingNumbers {

    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        // Read the first number from the user
        double number1 = input.nextDouble();

        // Second number
        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        // Third number
        System.out.println("Enter the third Number: ");
        double number3 = input.nextDouble();

        // Sorted numbers will be printed here
        System.out.println("Sorted Numbers are:  ");
        displaySortedNumbers(number1, number2, number3);
    }

    // Method to sort the three numbers in ascending order
    public static void displaySortedNumbers(double number1, double number2, double number3) {
        // Check conditions to determine the sorting order
        // If number1 is smaller
        if ((number1 < number2) && (number1 < number3)) {
            // Print number1
            System.out.print(number1 + " ");
            // Check if number2 is smaller than number3
            if (number2 < number3)
                // If so, print number2 and number3
                System.out.print(number2 + " " + number3);
            else
                // If not print number3 and number2
                System.out.print(number3 + " " + number2);
        } else if ((number2 < number1 && number2 < number3)) { 
            // If number2 is the smallest
            if (number1 < number3)
                System.out.print(number1 + " " + number3);
            else
                System.out.print(number3 + " " + number1);
        } else if ((number3 < number1 && number3 < number2)) { 
            // If number3 is the smallest
            // Print number3
            System.out.print(number3 + " ");
            if (number1 < number2)
                System.out.print(number1 + " " + number2);
            else
                System.out.print(number2 + " " + number1);
        }
    }
}