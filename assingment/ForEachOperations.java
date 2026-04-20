import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ForEachOperations {
    public static void main(String[] args) {

        // 1. Stock Price Logger
        List<Double> stockPrices = Arrays.asList(150.20, 155.40, 149.80);
        stockPrices.forEach(price -> System.out.println("Live Feed: $" + price));

        // 2. Event Attendee Welcome Message
        List<String> attendees = Arrays.asList("John", "Sarah", "Mike");
        attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));

        // 3. IoT Sensor Readings
        List<Integer> readings = Arrays.asList(45, 88, 32, 95);
        int threshold = 80;
        readings.stream().filter(r -> r > threshold).forEach(r -> System.out.println("Alert! High Reading: " + r));

        // 4. Email Notifications
        List<String> emails = Arrays.asList("user1@test.com", "user2@test.com");
        emails.forEach(email -> sendEmailNotification(email));

        // 5. Logging Transactions
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002");
        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}