class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivotCount = 0;

        for (int num : nums)
            if (num < pivot)
                left.add(num);
            else if (num > pivot)
                right.add(num);
            else
                pivotCount++;

        int[] res = new int[nums.length];
        int i = 0;

        for (int num : left)
            res[i++] = num;

        while (pivotCount > 0) {
            res[i++] = pivot;
            pivotCount--;
        }

        for (int num : right)
            res[i++] = num;

        return res;
    }
}