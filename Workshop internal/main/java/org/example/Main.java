package org.example;

import java.sql.*;





public class Main {
    public static void main(String[] args) {
        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();
        RouteDAO dao = new RouteDAO();
        String driverId = "D1204";

        // Sample Data based on your requirements
        route.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 50.0, 30, 40));
        route.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20.0, 15, 15));
        route.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10.0, 20, 55));
        route.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 40.0, 45, 60));

        // Output Display
        System.out.println("Driver: " + driverId + " – Kavita Nair");
        System.out.println("Route Summary:");
        route.printRoute();

        double dist = route.computeTotalDistance();
        double penalty = route.computeTotalPenalty();
        System.out.println("Total Distance: " + dist + " km");
        System.out.println("Route Score: " + (dist - penalty));

        // Attempting to sync to MySQL
        System.out.println("\nSyncing data to MySQL...");
        // You would typically iterate the list here to save all
    }
}