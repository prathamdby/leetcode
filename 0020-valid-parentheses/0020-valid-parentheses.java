class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() == 1) return false;

        Stack<Character> op = new Stack<>();

        HashMap<Character, Character> brMap = new HashMap<>();
        brMap.put(')', '(');
        brMap.put(']', '[');
        brMap.put('}', '{');

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (ch == '(' || ch == '[' || ch == '{')
                op.push(ch);
            else {
                if (op.empty())
                    return false;

                char brCh = op.pop();
                if (brCh != brMap.get(ch))
                    return false;
            }
        }

        return op.empty();
    }
}