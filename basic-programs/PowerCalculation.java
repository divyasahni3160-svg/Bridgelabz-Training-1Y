import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base number
        System.out.print("Enter the base number: ");
        // Read the base as a double to handle a wide range of inputs
        double base = scanner.nextDouble();

        // Prompt the user for the exponent
        System.out.print("Enter the exponent: ");
        // Read the exponent as a double
        double exponent = scanner.nextDouble();

        // Calculate the power using Math.pow()
        // The method returns a double value
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}