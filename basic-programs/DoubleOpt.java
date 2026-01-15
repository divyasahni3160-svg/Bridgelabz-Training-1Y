import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: a, b, c as double
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Double operations (same precedence rules apply)
        double result1 = a + b * c;     // multiplication first, then addition
        double result2 = a * b + c;     // multiplication first, then addition
        double result3 = c + a / b;     // division first, then addition
        double result4 = a % b + c;     // modulus first, then addition (works with double too)

        // Output
        System.out.println("The results of Double Operations are " +
                           result1 + ", " + result2 + ", " +
                           result3 + ", and " + result4);

        sc.close();
    }
}