// https://leetcode.com/problems/happy-number/submissions/1570028096/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isHappy(int n) {
        int counter = 0;
        int sumOfSquares = 0;
        while (n >= 10) {
            if (counter > 0) {
                n = sumOfSquares;
                sumOfSquares = 0;
            }
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
                sumOfSquares += digit * digit;
            }
            counter++;
        }
        return n == 1 || n == 7;
    }
}
