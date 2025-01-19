class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        for (char character : allowed.toCharArray()) {
            allowedSet.add(character);
        }

        int count = 0;

        for (String word : words) {
            int isConsistent = 1;

            for (char character : word.toCharArray())
                if (!allowedSet.contains(character)) {
                    isConsistent = 0;
                    break;
                }

            count += isConsistent;
        }

        return count;
    }
}