class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> visited = new HashMap<>();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (char ch : sChars) {
            if (visited.containsKey(ch))
                visited.put(ch, visited.get(ch) + 1);
            else
                visited.put(ch, 1);
        }

        for (char ch : tChars) {
            if (visited.containsKey(ch))
                if (visited.get(ch) > 0)
                    visited.put(ch, visited.get(ch) - 1);
                else
                    return false;
        }

        boolean anagram = true;
        for (Integer count : visited.values()) {
            if (count != 0) {
                anagram = false;
                break; // No need to check further
            }
        }

        return anagram;
    }
}