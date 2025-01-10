class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++)
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
        }

        List<String> res = new ArrayList<>();
        for (String word : words1) {
            boolean isSub = true;

            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++)
                if (freq[i] < maxFreq[i]) {
                    isSub = false;
                    break;
                }

            if (isSub)
                res.add(word);
        }

        return res;
    }

    private int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray())
            freq[c - 'a']++;

        return freq;
    }
}