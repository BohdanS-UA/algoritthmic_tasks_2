// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/1596293528/

class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for(int i = 1; i < salary.length; i++) {
            if(salary[i] < min) min = salary[i];
            if(salary[i] > max) max = salary[i];
            sum += salary[i];
        }

        return (sum - max - min) / (salary.length - 2);
    }
}
