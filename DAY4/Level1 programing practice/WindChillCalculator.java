public class WindChillCalculator {

    // creat method 
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        WindChillCalculator calculator = new WindChillCalculator();
       
        double temperature = 10.0;  
        double windSpeed = 15.0;    
        
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        
        System.out.printf("The wind chill temperature is: " + windChill);
    }
}
