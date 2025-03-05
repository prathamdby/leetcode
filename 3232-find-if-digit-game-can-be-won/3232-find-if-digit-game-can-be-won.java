class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitsSum = 0;
        int doubleDigitsSum = 0;

        for (int num : nums)
            if (num <= 9)
                singleDigitsSum += num;
            else
                doubleDigitsSum += num;

        return singleDigitsSum != doubleDigitsSum;
    }
}