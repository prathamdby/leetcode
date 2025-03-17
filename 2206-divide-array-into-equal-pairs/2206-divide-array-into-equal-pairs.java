class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];

        for (int num : nums)
            freq[num] ^= 1;

        for (int value : freq)
            if (value == 1)
                return false;

        return true;
    }
}