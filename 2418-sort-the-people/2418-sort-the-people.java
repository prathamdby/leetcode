class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int[][] people = new int[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = heights[i];
            people[i][1] = i;
        }

        Arrays.sort(people, (a, b) -> Integer.compare(b[0], a[0]));

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++)
            sortedNames[i] = names[people[i][1]];

        return sortedNames;
    }
}
