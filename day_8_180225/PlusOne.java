// https://leetcode.com/problems/plus-one/submissions/1547209551/

class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean isTen = false;
        do {
            isTen = false;
            digits[index]++;
            if (digits[index] == 10) {
                digits[index] = 0;
                index--;
                isTen = true;
            }
        } while (isTen && index >= 0);
        if (isTen) {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            System.arraycopy(digits, 0, newResult, 1, digits.length);
            return newResult;
        }
        return digits;
    }
}
