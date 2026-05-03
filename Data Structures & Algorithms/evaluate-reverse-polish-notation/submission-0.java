class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") || tokens[i].equals("-") ||
                tokens[i].equals("*") || tokens[i].equals("/")) {

                int num1 = Integer.parseInt(st.pop());
                int num2 = Integer.parseInt(st.pop());

                int ans = 0;

                if (tokens[i].equals("+"))
                    ans = num2 + num1;
                else if (tokens[i].equals("-"))
                    ans = num2 - num1;
                else if (tokens[i].equals("*"))
                    ans = num2 * num1;
                else
                    ans = num2 / num1;

                st.push(Integer.toString(ans));
            } 
            else {
                st.push(tokens[i]);
            }
        }

        return Integer.parseInt(st.peek());
    }
}
