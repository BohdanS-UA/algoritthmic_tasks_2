// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        List<Integer> list = new ArrayList<>(4);
        list.add(a * (b + c));
        list.add(a * b * c);
        list.add(a + b * c);
        list.add((a + b) * c);
        list.add(a + b + c);
        return list.stream().max(Comparator.naturalOrder()).get();
    }
}
