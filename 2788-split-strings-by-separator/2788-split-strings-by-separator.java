class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for (String word : words)
            for (String split : word.split("\\" + separator))
                if (!split.isEmpty())
                    res.add(split);

        return res;
    }
}