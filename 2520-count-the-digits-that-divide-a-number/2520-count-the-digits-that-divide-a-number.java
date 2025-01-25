class Solution {
    public int countDigits(int num) {
        int n = num, count = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder > 0 && num % remainder == 0)
                count++;
            n /= 10;
        }

        return count;
    }
}