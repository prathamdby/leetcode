class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++)
            if ((nums[i] & 1) == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }

        return nums;
    }
}