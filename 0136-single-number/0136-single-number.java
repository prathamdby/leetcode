class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> set : freq.entrySet())
            if (set.getValue() == 1) return set.getKey();

        return 0;
    }
}