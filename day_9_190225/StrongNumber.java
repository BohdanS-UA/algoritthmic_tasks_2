// https://www.codewars.com/kata/5a4d303f880385399b000001/train/java

class StrongNumber {
    public static String isStrongNumber(int num) {
        String s = String.valueOf(num);
        int factorial = 0;
        for (int i = 0; i < s.length() ; i++) {
            factorial += getFactorial(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return num == factorial ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int getFactorial(int digit) {
        int result = 1;
        for (int i = 2; i <= digit; i++) {
            result *= i;
        }
        return result;
    }
}
