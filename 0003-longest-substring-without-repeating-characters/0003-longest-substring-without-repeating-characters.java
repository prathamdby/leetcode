class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;

        StringBuilder sb = new StringBuilder();
        int maxLen = 0;

        for (char ch : s.toCharArray()) {
            int index = sb.indexOf(Character.toString(ch));
            if (index != -1)
                sb.delete(0, index + 1);

            sb.append(ch);
            maxLen = Math.max(maxLen, sb.length());
        }

        return maxLen;
    }
}