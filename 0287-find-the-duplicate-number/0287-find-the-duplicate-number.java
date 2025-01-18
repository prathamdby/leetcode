class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();

        for (int num : nums)
            if (visited.contains(num))
                return num;
            else
                visited.add(num);

        return 0;
    }
}