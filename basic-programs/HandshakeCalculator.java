import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula: (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is " + handshakes);

        sc.close();
    }
}