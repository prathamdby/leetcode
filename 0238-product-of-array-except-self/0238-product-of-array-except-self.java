class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];
        int[] pre = new int[n];
        int[] pos = new int[n];

        pre[0] = 1;
        pos[n - 1] = 1;

        for (int i = 1; i < n; i++)
            pre[i] = nums[i - 1] * pre[i - 1];

        for (int i = n - 2; i >= 0; i--)
            pos[i] = nums[i + 1] * pos[i + 1];

        for (int i = 0; i < n; i++)
            res[i] = pre[i] * pos[i];

        return res;
    }
}