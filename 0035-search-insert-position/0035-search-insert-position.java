class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];

            if (num == target)
                return mid;
            else if (num > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
}