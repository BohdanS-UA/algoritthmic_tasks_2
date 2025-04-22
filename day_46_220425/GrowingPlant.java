// https://www.codewars.com/kata/58941fec8afa3618c9000184/train/java

public class SimpleFun {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int counter = 0;
        int high = 0;
        while (true) {
            high += upSpeed;
            counter++;
            if (high >= desiredHeight) {
                return counter;
            }
            high -= downSpeed;
        }
    }
}
