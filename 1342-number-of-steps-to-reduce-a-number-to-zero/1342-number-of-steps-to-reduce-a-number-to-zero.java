class Solution {
    public int numberOfSteps(int n) {
        if (n == 0) return 0;

        int res = 0;
        while (n > 0) {
            if ((n & 1) == 0)
                n /= 2;
            else
                n--;

            res++;
        }

        return res;
    }
}