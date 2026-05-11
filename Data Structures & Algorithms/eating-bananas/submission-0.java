class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int i=0;i<piles.length;i++)
        {
               r=Math.max(r,piles[i]);
        }
        int ans=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(piles,h,mid))
            {
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;

        }
      
        return ans;
    }
    public boolean check(int piles[],int h,int val)
    {
           int l=0;
           for(int i=0;i<piles.length;i++)
           {
               l+=piles[i]/val;
               if(piles[i]%val!=0)
               l++;
           }
           if(l<=h)
           return true;
           return false;
    }
}
