class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int idx = stk.pop();
                res[idx] = i - idx;
            }

            stk.push(i);
        }

        return res;
    }
}