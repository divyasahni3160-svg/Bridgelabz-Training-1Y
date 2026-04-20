import Q1.LightPattern;
import Q2.Product;
import Q3.Invoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // PART 1: LAMBDA EXPRESSIONS
        // ==========================================

        // 1. Smart Home Lighting Automation
        LightPattern motionTrigger = () -> System.out.println("Trigger: Motion - Dimming to 30%");
        LightPattern voiceTrigger = () -> System.out.println("Trigger: Voice - Setting to Party Mode");
        motionTrigger.activate();
        voiceTrigger.activate();

        // 2. Custom Sorting in E-Commerce
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Laptop", 1200.0, 4.5),
                new Product("Phone", 800.0, 4.8),
                new Product("Headphones", 150.0, 4.2)
        ));
        // Sorting by Price (Ascending) using Lambda
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Sorted by Price: " + products);

        // 3. Notification Filtering
        List<String> alerts = Arrays.asList("CRITICAL: Oxygen Low", "INFO: Checkup scheduled", "CRITICAL: High BP");
        Predicate<String> criticalFilter = (alert) -> alert.startsWith("CRITICAL");
        System.out.println("Filtering Critical Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);


        // ==========================================
        // PART 2: METHOD REFERENCES
        // ==========================================

        // 1. Hospital Patient ID Printing
        List<Integer> patientIds = Arrays.asList(1001, 1002, 1003);
        System.out.println("Printing Patient IDs:");
        patientIds.forEach(System.out::println); // Method Reference: System.out::println

        // 2. Name Uppercasing
        List<String> employees = Arrays.asList("alice", "bob", "charlie");
        List<String> upperCaseNames = employees.stream()
                .map(String::toUpperCase) // Method Reference
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // 3. Invoice Object Creation
        List<Integer> transactionIds = Arrays.asList(501, 502, 503);
        List<Invoice> invoiceList = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
    }
}
