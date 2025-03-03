class Solution {
    public int sumOfUnique(int[] nums) {
        int res = 0;

        int[] freq = new int[101];
        for (int num : nums)
            freq[num]++;

        for (int i = 0; i < freq.length; i++)
            if (freq[i] == 1)
                res += i;

        return res;
    }
}