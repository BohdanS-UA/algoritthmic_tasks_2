// https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java

public class Partlist {
    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                    builder.append(arr[j]).append(" ");
                if (j == i) {
                    result[i][0] = builder.toString().trim();
                    builder = new StringBuilder();
                }
            }
            result[i][1] = builder.toString().trim();
        }
        return result;
    }
}
