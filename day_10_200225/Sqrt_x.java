// https://leetcode.com/problems/sqrtx/submissions/1549419489/

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int finish = x;

        while (true) {
            long medium = (finish - start) / 2 + start;
            if (medium * medium <= x && (medium + 1) * (medium + 1) > x ) {
                return (int) medium;
            }

            if (medium * medium > x) {
                finish = (int) medium - 1;
            } else {
                start = (int) medium + 1;
            }
        }    
    }
}
