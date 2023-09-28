class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minStack;
    private int min;

    public MinStack() {
        this.min = Integer.MAX_VALUE;
        this.st = new Stack<>();
        this.minStack = new Stack<>();
        this.minStack.push(min);
        
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        st.push(val);
        minStack.push(min);
    }
    
    public void pop() {
        st.pop();
        minStack.pop();
        this.min = minStack.peek();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}