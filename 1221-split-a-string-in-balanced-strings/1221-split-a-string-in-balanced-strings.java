class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int count = 0;

        char[] sArr = s.toCharArray();
        for (char ch : sArr) {
            count += ch == 'R' ? 1 : -1;
            if (count == 0)
                res++;
        }

        return res;
    }
}