import java.lang.reflect.Member;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
public class Main {
}
class Movie {
    String title; double rating; int year;
    Movie(String t, double r, int y) { title = t; rating = r; year = y; }
    public double getRating() { return rating; }
    @Override public String toString() { return title + " (" + year + ") - " + rating; }
}

class Doctor {
    String name; String specialty; boolean availableWeekend;
    Doctor(String n, String s, boolean aw) { name = n; specialty = s; availableWeekend = aw; }
    public String getSpecialty() { return specialty; }
    @Override public String toString() { return name + " [" + specialty + "]"; }
}

public class StreamAPIProblemSet {
    public static void main(String[] args) {

        // 1. Top 5 Trending Movies
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 4.5, 2024), new Movie("Movie B", 4.8, 2023),
                new Movie("Movie C", 4.2, 2024), new Movie("Movie D", 4.9, 2024),
                new Movie("Movie E", 3.9, 2022), new Movie("Movie F", 4.7, 2024)
        );
        System.out.println("--- Top 5 Trending Movies ---");
        movies.stream()
                .filter(m -> m.year == 2024)
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .limit(5)
                .forEach(System.out::println);

        // 2. Hospital Doctor Availability
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Smith", "Cardiology", true),
                new Doctor("Dr. Adams", "Neurology", false),
                new Doctor("Dr. Brown", "Cardiology", true)
        );
        System.out.println("\n--- Available Doctors ---");
        doctors.stream()
                .filter(d -> d.availableWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .forEach(System.out::println);

        // 3. Insurance Claim Analysis
        // (Assuming a simple Claim class with Type and Amount)
        Object Claim;
        Map<String, Double> avgClaims = Arrays.asList(new Claim("Health", 500), new Claim("Auto", 1200))
                .stream()
                .collect(Collectors.groupingBy(Claim::getType, Collectors.averagingDouble(Claim::getAmount)));

        // 4. Filtering Expiring Memberships
        List<Member> members = Arrays.asList(new Member("Alice", LocalDate.now().plusDays(10)));
        members.stream()
                .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println("Expiring: " + m.name));

        // 5. Transforming Names
        List<String> customers = Arrays.asList("charlie", "alice", "bob");
        customers.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}