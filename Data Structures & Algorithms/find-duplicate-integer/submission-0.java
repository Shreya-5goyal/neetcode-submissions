class Solution {
    public int findDuplicate(int[] nums) {
         
      int slow = nums[0];
int fast = nums[0];

do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);
         int next=nums[0];

            while(next!=slow)
            {
                 next=nums[next];
                 slow=nums[slow];

            }
            return slow;
        
    }
}
