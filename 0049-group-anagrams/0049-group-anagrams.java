class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (String s : strs) {
            char[] sortedArray = s.toCharArray();
            Arrays.sort(sortedArray);
            String sorted = new String(sortedArray);

            group.putIfAbsent(sorted, new ArrayList<>());
            group.get(sorted).add(s);
        }

        return new ArrayList<>(group.values());
    }
}
