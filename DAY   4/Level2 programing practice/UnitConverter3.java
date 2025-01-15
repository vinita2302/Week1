public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double poundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double gallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double litersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

 
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 10.0;
        double liters = 25.0;

        System.out.println(fahrenheit + " Fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius = " + celsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(pounds + " pounds = " + poundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms = " + kilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + gallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + litersToGallons(liters) + " gallons");
    }
}
