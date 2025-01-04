class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1)
            return nums;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freq.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = entryList.get(i).getKey();

        return result;
    }
}