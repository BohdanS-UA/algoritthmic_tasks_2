// https://www.codewars.com/kata/585a1a227cb58d8d740001c3/train/java

public class Repeater{
  public static String repeat(String string,long n){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(string);
        }
        return builder.toString();
  }
}
