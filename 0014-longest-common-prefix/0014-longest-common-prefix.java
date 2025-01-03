class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        char[] characters = strs[0].toCharArray();

        for (char ch : characters) {
            String p = prefix.toString() + Character.toString(ch);

            for (String str : strs)
                if (!str.startsWith(p))
                    return prefix.toString();

            prefix.append(ch);
        }

        return prefix.toString();
    }
}