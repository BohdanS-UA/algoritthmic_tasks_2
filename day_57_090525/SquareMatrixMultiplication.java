// https://www.codewars.com/kata/5263a84ffcadb968b6000513/train/java

public class Kata {
	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        int length = a.length;
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length; j++) {
                int sum = 0;
                for (int k = 0; k < length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
	}
}
