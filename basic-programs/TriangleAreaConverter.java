import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: base and height in cm
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);

        sc.close();
    }
}