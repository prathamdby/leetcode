class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0) return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int toFind = ++nums[i];
            if (nums[i + 1] != toFind)
                return toFind;
        }

        return ++nums[nums.length - 1];
    }
}