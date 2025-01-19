class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            boolean isAllowed = true;

            for (char character : word.toCharArray()) {
                if (allowed.indexOf(character) == -1) {
                    isAllowed = false;
                    break;
                }
            }

            if (!isAllowed) continue;

            count++;
        }

        return count;
    }
}