class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") || tokens[i].equals("-") ||
                tokens[i].equals("*") || tokens[i].equals("/")) {

                int num1 = st.pop();
                int num2 = st.pop();

                int ans = 0;

                if (tokens[i].equals("+"))
                    ans = num2 + num1;
                else if (tokens[i].equals("-"))
                    ans = num2 - num1;
                else if (tokens[i].equals("*"))
                    ans = num2 * num1;
                else
                    ans = num2 / num1;

                st.push(ans);
            } 
            else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.peek();
    }
}
