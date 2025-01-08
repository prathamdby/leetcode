class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;

        int hn = haystack.length();
        int nn = needle.length();

        for (int i = 0; i < hn; i++)
            if (nn > 1) {
                if (i + (nn - 1) < hn && haystack.substring(i, i + nn).equals(needle))
                    return i;
            } else if (Character.toString(haystack.charAt(i)).equals(needle))
                return i;

        return -1;
    }
}