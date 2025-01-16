class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;

        for (String sen : sentences)
            res = Math.max(sen.split(" ").length, res);

        return res;
    }
}