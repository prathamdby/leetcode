class Solution {
    public int minimumChairs(String s) {
        int res = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'E')
                count++;
            else
                count--;

            res = Math.max(res, count);
        }

        return res;
    }
}