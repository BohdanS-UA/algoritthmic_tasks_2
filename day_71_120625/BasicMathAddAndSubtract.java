// https://www.codewars.com/kata/5809b62808ad92e31b000031/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static String calculate(String str) {
        String[] strings = str.replace("plus", " ")
                .replace("minus", " -")
                .split(" ");
      
        int sum = Arrays.stream(strings)
                .mapToInt(Integer::parseInt)
                .sum();

        return String.valueOf(sum);
    }
}
