class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int low=0;
        int high=0;
        long sum=0;
        long maxsum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(high=0;high<nums.length;high++)
        {
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            sum+=nums[high];
            if(high-low+1==k)
            {
                if(map.size()==k)
                {

                
                maxsum=Math.max(sum,maxsum);
                }
               if(map.get(nums[low])==1){

               

                map.remove(nums[low]);
               }
               else{
                map.put(nums[low],map.get(nums[low])-1);
               }
                sum-=nums[low];
                 low++;
            }
            
        }
        return maxsum;

    }
}