class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> wordFreq = new HashMap<>();

        String[] words = paragraph.replaceAll("[!?',;\\.]", " ").toLowerCase().split("\\s+");

        if (words.length == 1) return words[0];

        for (String word : words) {
            if (bannedSet.contains(word))
                continue;

            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        String mostCommon = "";
        int maxCount = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}
