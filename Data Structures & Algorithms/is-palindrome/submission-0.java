class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        s = s.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");;
        for(int i =0 ; i < s.length();i++)
        {
                stack.push(s.charAt(i));
        }

        for(int i =0 ; i < s.length();i++)
        {
            if(s.charAt(i) != stack.pop())
                return false;
        }
        return true;
    }
}
