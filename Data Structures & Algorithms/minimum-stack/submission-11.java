class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (!minstack.isEmpty()){
            val = Math.min(val, minstack.peek());
        }
        minstack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
