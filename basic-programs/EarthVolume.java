public class EarthVolume {
    public static void main(String[] args) {
        
        double radius_km = 6378.0;

        
        double km_to_miles = 1.0 / 1.60934;
        
        
        double volume_km3 = (4.0 / 3.0) * Math.PI * Math.pow(radius_km, 3);

        
        double volume_miles3 = volume_km3 * Math.pow(km_to_miles, 3);
        
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volume_km3, volume_miles3);
    }
}
