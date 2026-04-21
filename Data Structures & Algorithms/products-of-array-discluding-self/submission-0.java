class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        arr1[0]=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            arr1[i]=nums[i]*arr1[i-1];
        }
        arr2[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            arr2[i]=arr2[i+1]*nums[i];
        }
        nums[0]=arr2[1];
        nums[nums.length-1]=arr1[nums.length-2];
        for(int i=1;i<nums.length-1;i++)
        {
           nums[i]=arr1[i-1]*arr2[i+1];
        }
        return nums;
        
    }
}