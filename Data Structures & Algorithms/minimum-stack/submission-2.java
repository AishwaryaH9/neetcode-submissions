class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.size() == 0 || minStack.peek() >= val)
            minStack.push(val);
       
    }
    
    public void pop() {
        if(stack.size() == 0)
            return;
        int elem = stack.pop();
        if(minStack.size() != 0 && elem == minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        if(stack.size() == 0)
            return -1;
        else
            return stack.peek();
    }
    
    public int getMin() {
        if(minStack.size() ==0)
            return -1;
        return minStack.peek();
        
    }
}
