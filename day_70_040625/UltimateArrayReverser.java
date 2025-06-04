// https://www.codewars.com/kata/5c3433a4d828182e420f4197/train/java

public class ArrayReverser
{
   public static String[] reverse(String[] a)
   {
        int[] length = new int[a.length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            length[i] = a[i].length();
            builder.append(a[i]);
        }
        builder.reverse();
        String[] resultArr = new String[length.length];
        int currentPos = 0;
        for (int i = 0; i < length.length ; i++) {
            resultArr[i] = builder.substring(currentPos, currentPos + length[i]);
            currentPos += length[i];
        }
        return resultArr;
   }
}
