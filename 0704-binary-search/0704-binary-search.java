class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int num = nums[mid];

            if (num == target)
                return mid;
            else if (num > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}