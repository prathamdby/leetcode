class Solution {
    public boolean isPalindrome(int x) {
        int palindrome = x;
        int reverse = 0;

        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome /= 10;
        }

        return x == reverse;
    }
}