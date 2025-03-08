class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();

        for (String word : title.split(" "))
            if (word.length() < 3)
                sb.append(word.toLowerCase() + " ");
            else {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1).toLowerCase() + " ");
            }

        return sb.toString().trim();
    }
}