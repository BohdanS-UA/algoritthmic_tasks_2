// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {
	public static String orderWeight(String strng) {
		    String[] weightsString = strng.split(" ");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int sum1 = Arrays.stream(o1.split(""))
                        .mapToInt(Integer::valueOf)
                        .sum();
                int sum2 = Arrays.stream(o2.split(""))
                        .mapToInt(Integer::valueOf)
                        .sum();
                if (sum1 != sum2) {
                    return sum1 - sum2;
                } else {
                    return o1.compareTo(o2);
                }
            }
        };
        return Arrays.stream(weightsString)
                .sorted(comparator)
                .collect(Collectors.joining(" "));
	}
}
