// https://www.codewars.com/kata/68508d8937ee53321e405d31/train/java

public class Kata {
    public static int matrixDiagonal(int[][] matrix, int value){
        int sum = 0;
        int iCorrection = 0;
        int jCorrection = 0;
        if (value >= 0) {
            iCorrection = value;
        } else {
            jCorrection = Math.abs(value);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i - iCorrection == j - jCorrection) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
