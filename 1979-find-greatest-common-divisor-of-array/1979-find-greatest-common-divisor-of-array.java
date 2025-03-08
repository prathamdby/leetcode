class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        int res = 0;

        for (int i = 1; i <= min; i++)
            if (min % i == 0 && max % i == 0)
                res = i;

        return res;
    }
}