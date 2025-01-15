class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') k--;
            if (k == 0) return s.substring(0, i);
        }

        return s;
    }
}