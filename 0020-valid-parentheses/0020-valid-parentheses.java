class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() == 1) return false;

        char[] chStack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                chStack[++top] = ')';
            else if (ch == '{')
                chStack[++top] = '}';
            else if (ch == '[')
                chStack[++top] = ']';
            else if (top == -1 || chStack[top--] != ch)
                return false;
        }

        return top == -1;
    }
}