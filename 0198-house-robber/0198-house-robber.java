class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int rob = 0, skip = 0;

        for (int num : nums) {
            int newRob = skip + num;
            int newSkip = Math.max(skip, rob);

            skip = newSkip;
            rob = newRob;
        }

        return Math.max(rob, skip);
    }
}