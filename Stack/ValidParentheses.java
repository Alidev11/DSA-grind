class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    st.push(s.charAt(i));
                    break;
                case '{':
                    st.push(s.charAt(i));
                    break;
                case '[':
                    st.push(s.charAt(i));
                    break;
                case ')':
                    if (st.isEmpty()) {
                        return false;
                    } else if (st.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (st.isEmpty()) {
                        return false;
                    } else if (st.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (st.isEmpty()) {
                        return false;
                    } else if (st.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        if (!st.isEmpty())
            return false;

        return true;
    }
}