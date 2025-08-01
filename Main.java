import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Part 1: Declare variables for sum, evenCount, and oddCount
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Part 2: Input validation for the number of integers to analyze
        int count;
        System.out.print("How many numbers do you want to analyze? ");
        count = keyboard.nextInt();

        // Input validation: Ensure the user enters a positive number for count
        while (count <= 0) {
            System.out.print("Please enter a positive number: ");
            count = keyboard.nextInt();
        }

        // Part 3: Use a for loop to collect and analyze 'count' number of integers
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = keyboard.nextInt();

            // Add current number to the sum
            sum += currentNumber;

            // Check if the number is even or odd and update the counts
            if (currentNumber % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++; // Increment odd count
            }
        }

        // Part 4: Print the final report
        System.out.println("\nFinal Report:");
        System.out.println("Total sum: " + sum);
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        keyboard.close(); // Close the scanner
    }
}