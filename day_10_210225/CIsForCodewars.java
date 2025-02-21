// https://www.codewars.com/kata/675dc1d3830826975c58a09d/train/java

public class GenerateC {
    public static String generateC(int size) {
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size * 5; i++) {
                builder.append('C');
            }
            builder.append('\n');
        }

        for (int j = 0; j < 3 * size; j++) {
            for (int i = 0; i < size; i++) {
                builder.append('C');
            }
            builder.append('\n');
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size * 5; i++) {
                builder.append('C');
            }
            if (j != (size - 1)) {
                builder.append('\n');
            }
        }

        return builder.toString();
    }
}
