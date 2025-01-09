class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2, right = x / 2;

        while (left <= right) {
            int mid = (left + right) / 2;
            long num = (long) mid * mid;

            if (num == x)
                return mid;
            else if (num > x)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return right;
    }
}