package Q3;

public class Invoice {
    int id;
    Invoice(int id) {
        this.id = id;
        System.out.println("Invoice generated for Transaction ID: " + id);
    }
}
