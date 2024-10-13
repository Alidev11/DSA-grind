class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        min.push(Math.min(min.peek(), val));
        st.push(val);
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        if (st.empty())
            return 0;
        return min.peek();
    }
}