class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/") )
            {
                if(stack.size() < 2)
                    return -1;
                int op2 = stack.pop();
                int op1 = stack.pop();
                int result = calculateResult(op1,op2,tokens[i]);
                stack.push(result);
            }
            else
            {
                stack.push(Integer.valueOf(tokens[i]));

            }
        }
        return (stack.size() !=0 ? stack.pop() : -1);
    }
        
    

    private int calculateResult(int op1,int op2,String operator)
    {
        switch(operator)
        {
            case "+": return op1 + op2;
            case "-": return op1 - op2;
            case "*": return op1 * op2;
            case "/": return op1 / op2;
            default : return 0;
        }
    }

}
