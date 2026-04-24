class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list=new ArrayList<>();
       Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
          
             int l=i+1;int r=nums.length-1;
             while(l<r)
             {
                 long sum=nums[r]+nums[l]+nums[i];
                  if( nums[r]+nums[l]+nums[i]==0)
                  {
                      ArrayList<Integer> le=new ArrayList<>();
                      le.add(nums[i]);
                      le.add(nums[l]);
                      le.add(nums[r]);
                      list.add(le);
                       while(l<r&&nums[l]==nums[l+1])
                  {
                      l++;
                  }
                  while(l<r&&nums[r]==nums[r-1])
                  {
                    r--;
                  }
                  l++;
                  r--;
                  }
                  else if(sum>0)
                  r--;
                  else l++;
                 
                
             }
        }
             return list;
             
        
    }
}
