public class M01EX1 {

    /** feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display conversion table
        System.out.println("| Feet | Meter | Meter | Feet  |");
        System.out.println("|------|-------|-------|-------|");

        for (int i = 0; i <= 10; i++) {
            double feet = i + 1.0; // Feet values from 1.0 to 10.0
            double meter = 20.0 + i * 5.0; // Meters values from 20.0 to 65.0

            // Print conversion row
            System.out.printf("| %4.1f | %6.3f | %5.1f | %6.3f |\n", 
                feet, footToMeter(feet), meter, meterToFoot(meter));
        }
    }
}