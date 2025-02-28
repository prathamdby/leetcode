class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for (int candy : candies)
            maxCandy = Math.max(candy, maxCandy);

        List<Boolean> res = new ArrayList<>();
        for (int candy : candies)
            res.add(candy + extraCandies >= maxCandy);

        return res;
    }
}