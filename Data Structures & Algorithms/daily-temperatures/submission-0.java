class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[]=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        st.push(temp.length-1);
         res[temp.length-1]=0;
        for(int i=temp.length-2;i>=0;i--)
        {
                
                while(!st.isEmpty()&&temp[i]>=temp[st.peek()])
                {

                
                    st.pop();
                }
                if(!st.isEmpty())
              res[i]=st.peek()-i;
              
              st.push(i);
                

        }

        return res;
    }
}
