import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: a, b, c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Integer operations
        int result1 = a + b * c;     // multiplication first, then addition
        int result2 = a * b + c;     // multiplication first, then addition
        int result3 = c + a / b;     // division first, then addition
        int result4 = a % b + c;     // modulus first, then addition

        // Output
        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " +
                           result3 + ", and " + result4);

        sc.close();
    }
}