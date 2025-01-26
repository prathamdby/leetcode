class Solution {
    public boolean isPowerOfTwo(int n) {
        double num = (double) n;

        while (num > 1)
            num /= 2;

        return num == 1.0;
    }
}