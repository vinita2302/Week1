public class TrigonometryCalculator {

    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Store the results in an array and return
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometryCalculator calculator = new TrigonometryCalculator();

        double angle = 45.0;  
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Print the results
        System.out.printf("Sine of %.2f degrees: %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f%n", angle, results[2]);
    }
}
