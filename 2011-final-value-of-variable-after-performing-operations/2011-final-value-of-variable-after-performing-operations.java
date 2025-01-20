class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for (String operation : operations)
            count += operation.charAt(1) == '+' ? 1 : -1;

        return count;
    }
}