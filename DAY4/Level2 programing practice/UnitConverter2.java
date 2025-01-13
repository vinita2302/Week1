public class UnitConverter2 {

    // Method to convert yards to feet
    public static double yardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double feetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double metersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double inchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double inchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    
    public static void main(String[] args) {
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 10.0;

        System.out.println(yards + " yards = " + yardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + feetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + metersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + inchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + inchesToCentimeters(inches) + " centimeters");
    }
}
