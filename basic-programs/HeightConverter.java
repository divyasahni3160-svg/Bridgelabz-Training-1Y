import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Conversion factors
        double inches = heightCm / 2.54;   // 1 inch = 2.54 cm
        int feet = (int) (inches / 12);    // 1 foot = 12 inches
        int remainingInches = (int) (inches % 12);

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + remainingInches);
    }
}