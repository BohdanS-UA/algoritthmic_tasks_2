// https://www.codewars.com/kata/56dbe0e313c2f63be4000b25/train/java

import java.util.function.Function;

class Opstrings {
     public static String vertMirror (String strng) {
        String[] strings = strng.split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        for (String string:strings) {
            StringBuilder builder = new StringBuilder(string);
            resultBuilder.append(builder.reverse()).append("\n");
        }
        return resultBuilder.toString().trim();
    }

    public static String horMirror (String string) {
        String[] strings = string.split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            resultBuilder.append(strings[i]).append("\n");
        }
        return resultBuilder.toString().trim();
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
