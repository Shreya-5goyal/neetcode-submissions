class Solution {
    public int trap(int[] height) {
        int l=0;int r=height.length-1;
        int maxl=0;
        int maxr=0;
        int water=0;
        while(l<r)
        {
             if(height[l]<=height[r])
             {
                if(height[l]>=maxl)
                {
                    maxl=height[l];
                }
                else water+=maxl-height[l];
                l++;
             }
             else{
            if (height[r] >= maxr) {
                    maxr = height[r];  // update right wall
                } else {
                    water += maxr - height[r]; // trap water
                }
                
                r--;
             }
            
        }
        return water;
    }
}
