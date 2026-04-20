package Q1;

public class SmartHome {
    public static void executePattern(LightPattern pattern) {
        pattern.activate();
    }

    public static void main(String[] args) {
        // Motion trigger pattern
        executePattern(() -> System.out.println("Motion detected: Dimming lights to 30%"));

        // Voice command pattern
        executePattern(() -> System.out.println("Voice command: Setting lights to Party Mode (RGB)"));
    }
}