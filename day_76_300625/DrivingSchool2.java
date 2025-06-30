// https://www.codewars.com/kata/589b1c15081bcbfe6700017a/train/java

public class Kata {
    public static int cost(int mins){
        int charge = 30;
        if (mins <= 65) {
            return charge;
        }
        mins -= 60;
        int halfHours = mins / 30;
        if (mins % 30 <= 5) {
            return charge + halfHours * 10;
        } else {
            return charge + (halfHours + 1) * 10;
        }
    }
}
