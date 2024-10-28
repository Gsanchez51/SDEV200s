public class TABLE {
        /** feet to meters*/
        public static double footToMeter(double foot) {
            return 0.305 * foot;
        }

        /** meters to feet */
        public static double meterToFoot(double meter) {
            return 3.279 * meter;
        }

        public static void main(String[] args) {
            System.out.printf("%-10s%-10s | %-10s%-10s%n", "Feet", "Meters", "|", "Meters", "Feet");
            System.out.println("-----------------------------------------");

            for (int foot = 1; foot <= 10; foot++) {
                double meter = footToMeter(foot);
                System.out.printf("%-10d%-10.2f | ", foot, meter);

            }
        
            System.out.println();

            for (int meter = 1; meter <= 10; meter++) {
                double foot = meterToFoot(meter);
                System.out.printf("%-10d%-10.2f | ", meter, foot);

        }
    }
}