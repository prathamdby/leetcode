class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastSeen.containsKey(nums[i]) && Math.abs(lastSeen.get(nums[i]) - i) <= k)
                return true;

            lastSeen.put(nums[i], i);
        }

        return false;
    }
}