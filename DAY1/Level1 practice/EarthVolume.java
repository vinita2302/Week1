public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Calculate the volume of Earth 
        double volumeKmCubed = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the volume from cubic kilometers to cubic miles 
        double volumeMilesCubed = volumeKmCubed * 0.239913;

        // print the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKmCubed + 
                           " and cubic miles is " + volumeMilesCubed);
    }
}
