class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
         int c=1;
         for(int i=0;i<nums.length;i++)
         {
            if(i>0&&nums[i]==nums[i-1])
            continue;
           else  if(i>0&&nums[i]==nums[i-1]+1)
              {
                ++c;
               // System.out.println(c);
                 max=Math.max(c,max);
              }
              else{
                max=Math.max(c,max);
                c=1;
              }
             
         }
        return max;
    }
}
