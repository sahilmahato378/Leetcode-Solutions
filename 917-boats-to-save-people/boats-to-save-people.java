class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int left=0;
        int res=0;
        int right=nums.length-1;
   Arrays.sort(nums);
   while(left<=right)
   {
   if(nums[left]+nums[right]<=limit)
   {
    res++;
    left++;
    right--;
   }
   else{
    res++;
    right--;
   }
   

 

   
   }
     return res;
  
    }
}