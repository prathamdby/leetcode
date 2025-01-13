class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int res = 0, maxFreq = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(freq.get(ch), maxFreq);

            while ((right - left + 1) - maxFreq > k) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
