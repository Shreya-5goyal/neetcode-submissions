class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int ans[]=new int[k];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {

            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);


        }
          PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer>m:mp.entrySet())
        {
            pq.add(new int[]{m.getKey(),m.getValue()});
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        int i=0;
        while(!pq.isEmpty())
        {

     ans[i]=pq.remove()[0];
     i++;
        }
        return ans;
    }
}
