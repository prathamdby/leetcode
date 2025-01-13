class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];

            if (nums[mid] > nums[right])
                left = ++mid;
            else
                right = mid;
        }

        return nums[left];
    }
}