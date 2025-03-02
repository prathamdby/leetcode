class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";

        for (String word : words)
            if (isPalindrome(word)) {
                res = word;
                break;
            }

        return res;
    }

    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;

        return true;
    }
}