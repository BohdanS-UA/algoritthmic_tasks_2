// https://www.codewars.com/kata/56484848ba95170a8000004d/train/java

public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
        double maxSpeed = 0;
        for (int i = 1; i < x.length; i++) {
            double currentSpeed = ((x[i] - x[i - 1]) * 3600) / s;
            if ( currentSpeed > maxSpeed) {
                maxSpeed = currentSpeed;
            }
        }
        return (int) maxSpeed;
    }
}
