class Solution {
    public int maxArea(int[] nums) {
        int l=0;int r=nums.length-1;
        int p=0;
        int max=0;
        while(l<r)
        {
           p= (r-l)*Math.min(nums[r],nums[l]);
           max=Math.max(p,max);
           if(nums[r]>nums[l])
           {
            l++;
           }
           else r--;

        }
        return max;
    }
}
