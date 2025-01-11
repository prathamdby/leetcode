class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int max = 0, min = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : nums)
            count[num - min]++;

        int index = 0;
        for (int i = 0; i < range; i++) {
            int freq = count[i];

            if (freq < 1) continue;

            int value = i + min;
            while (freq-- > 0)
                nums[index++] = value;
        }

        return nums;
    }
}