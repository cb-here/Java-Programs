public class Distance{
    public static void main(String[] args){
        float distanceKm, distanceFeet, distanceMeter, distanceInches, distanceCm;
        
        distanceKm = 1;
        distanceMeter = distanceKm * 1000;
        distanceFeet = distanceKm * 3280;
        distanceInches = distanceFeet * 12;
        distanceCm = distanceKm * 10_000;

        System.out.println("Distance in Km: " + distanceKm);
        System.out.println("Distance in meter: " + distanceMeter);
        System.out.println("Distance in feet: " + distanceFeet);
        System.out.println("Distance in inches: " + distanceInches);
        System.out.println("Distance in cm: " + distanceCm);
    }
}