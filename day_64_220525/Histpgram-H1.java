// https://www.codewars.com/kata/57d532d2164a67cded0001c7/train/java

public class Dinglemouse {

  public static String histogram(final int results[]) {
        StringBuilder builder = new StringBuilder();
        for (int i = results.length - 1; i >= 0 ; i--) {
            builder.append(i + 1).append("|");
            if (results[i] == 0) {
                builder.append("\n");
                continue;
            }
            for (int j = 0; j < results[i]; j++) {
                builder.append("#");
            }
            builder.append(" ").append(results[i]).append("\n");
        }
        return builder.toString();
  }
}
