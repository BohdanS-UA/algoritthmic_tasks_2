// https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java

public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w) {
            return l * w;
        } else {
            return l * 2 + w * 2;
        }
    }
}
