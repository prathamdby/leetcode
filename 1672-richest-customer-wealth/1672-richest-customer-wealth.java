class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;

        for (int[] acc : accounts) {
            int sum = 0;

            for (int num : acc)
                sum += num;

            res = Math.max(sum, res);
        }

        return res;
    }
}