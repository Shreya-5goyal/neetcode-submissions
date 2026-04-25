class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int n=s.length();
        int max=0;
        HashSet<Character> st=new HashSet<>();
       
        while(r<n)
        {
              while(st.contains(s.charAt(r)))
              {
                
                   
                         st.remove(s.charAt(l));
                         l++;
                        
                    
                    
                         
                   
              }
               max=Math.max(r-l+1,max);
              st.add(s.charAt(r));
               r++;
              
        }
        
        return max;

    }
}
