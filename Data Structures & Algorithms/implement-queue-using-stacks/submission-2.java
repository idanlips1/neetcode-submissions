class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> secondStack;
    public MyQueue() {
        stack = new Stack();
        secondStack = new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if (!secondStack.isEmpty()){
            return secondStack.pop();
        }
        while (stack.size() > 0){
            secondStack.push(stack.pop());
        }
        return secondStack.pop();
    }
    
    public int peek() {
        if (!secondStack.isEmpty()){
            return secondStack.peek();
        }
        while (stack.size() > 0){
            secondStack.push(stack.pop());
        }
        return secondStack.peek();
    }
    
    public boolean empty() {
        return secondStack.isEmpty() && stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */