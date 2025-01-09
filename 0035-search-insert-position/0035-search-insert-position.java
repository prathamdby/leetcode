class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        if (list.contains(target))
            return list.indexOf(target);

        list.add(target);

        Collections.sort(list);

        return list.indexOf(target);
    }
}