// https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java

import java.util.List;

public class Rotations {
    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.isEmpty()) {
            return true;
        }
        StringBuilder builder = new StringBuilder(strng);
        for (int i = 0; i < strng.length(); i++) {
            if (!arr.contains(builder.toString())) {
                return false;
            }
            char c = builder.charAt(0);
            builder.deleteCharAt(0);
            builder.append(c);
        }
        return true;
    }
}
