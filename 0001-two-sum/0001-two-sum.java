class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2)
            return new int[] { 0, 1 };

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (visited.containsKey(difference))
                return new int[] { i, visited.get(difference) };

            visited.put(nums[i], i);
        }

        return new int[] { 0, 0 };
    }
}