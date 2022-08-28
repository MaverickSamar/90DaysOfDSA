class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Character> st = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        sti.push(-1);
        
        
        int count=0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                st.push(c);
                sti.push(i);
            }
            else{
                if(st.size() == 0)
                {
                    sti.push(i);
                }
                else if(st.peek() > 0 && st.peek() != '(')
                {
                    sti.push(i);
                }
                else if(st.size() > 0 && st.peek() == '(')
                {
                    sti.pop();
                    st.pop();
                    count = i - sti.peek();
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
