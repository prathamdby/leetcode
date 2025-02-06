class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];

        int i = 0;
        int j = i + n;
        int index = 0;

        while (index < nums.length) {
            res[index++] = nums[i];
            res[index++] = nums[j];
            i++;
            j = i + n;
        }

        return res;
    }
}