class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=1;
        st.add(s.charAt(0));
        while(i<s.length())
        {
            if(s.charAt(i)==')')
            {
                if(!st.isEmpty()&&st.peek()=='(')
                st.pop();
                else return false;
            }
            else if(s.charAt(i)=='}')
            {
                if(!st.isEmpty()&&st.peek()=='{')
                st.pop();
                else return false;
            }
            else if(s.charAt(i)==']')
            {
                if(!st.isEmpty()&&st.peek()=='[')
                st.pop();
                else return false;
            }
            else st.add(s.charAt(i));
            i++;
        }
        if(st.isEmpty())
        return true;
        return false;
        
    }
}
