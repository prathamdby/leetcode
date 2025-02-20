class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                continue;

            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right] = temp;
        }
    }
}