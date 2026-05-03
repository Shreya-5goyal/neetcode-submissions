class MinStack {
  Stack<Integer> st;
   Stack<Integer> minSt;
    public MinStack() {
          st=new Stack<>();
          minSt=new Stack<>();
    }
    
    public void push(int val) {
        if(minSt.isEmpty()||minSt.peek()>=val)
        {
             minSt.push(val);
        }
      
        st.push(val);
        
    }
    
    public void pop() {
        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        st.pop();
        
    }
    
    public int top() {
        
       return st.peek();
       
    }
    
    public int getMin() {
        if(!minSt.isEmpty())
       return minSt.peek();
       return 0;

        
    }
}
