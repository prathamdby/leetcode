class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;

        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch))
                set.remove(s.charAt(left++));

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}