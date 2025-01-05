class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        HashSet<Integer> numsSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        for (Integer num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int length = 1;
                int n = num;
                
                while (numsSet.contains(n + 1)) {
                    n++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}