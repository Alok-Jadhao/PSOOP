import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read user's name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Read number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate charges
        double charges = calculateCharges(unitsConsumed);

        // Print the result
        System.out.println("Electricity charges for " + userName + ": Rs. " + charges);
    }

    // Method to calculate electricity charges
    private static double calculateCharges(int unitsConsumed) {
        double charges = 0;

        // For the first 100 units
        if (unitsConsumed <= 100) {
            charges = unitsConsumed * 0.60;
        }
        // For the next 200 units
        else if (unitsConsumed <= 300) {
            charges = 100 * 0.60 + (unitsConsumed - 100) * 0.80;
        }
        // Beyond 300 units
        else {
            charges = 100 * 0.60 + 200 * 0.80 + (unitsConsumed - 300) * 0.90;
        }

        // Minimum charge of Rs. 50.00
        charges = Math.max(charges, 50.00);

        // Additional charge if total amount is more than Rs. 300
        if (charges > 300) {
            charges += charges * 0.15;
        }

        return charges;
    }
}
