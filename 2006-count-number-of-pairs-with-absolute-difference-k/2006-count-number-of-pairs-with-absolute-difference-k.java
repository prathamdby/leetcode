class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;

        int[] freq = new int[101];
        for (int num : nums)
            freq[num]++;

        for (int i = k + 1; i < 101; i++)
            res += freq[i] * freq[i - k];

        return res;
    }
}