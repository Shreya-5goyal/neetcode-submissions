class Solution {
    public int maxProfit(int[] nums) {
        int p=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-min>p)
            {
                p=nums[i]-min;
            }
            else min=Math.min(nums[i],min);
        }
        return p;
    }
}
