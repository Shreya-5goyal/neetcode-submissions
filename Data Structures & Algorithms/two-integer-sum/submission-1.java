class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(target-nums[i]))
            {
                  arr[1]=i;
                  arr[0]=mp.get(target-nums[i]);
                  return arr;
            }
            mp.put(nums[i],i);
        }
         return arr;
    }
}
