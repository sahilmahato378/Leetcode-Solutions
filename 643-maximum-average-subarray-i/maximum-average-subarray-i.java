class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       int low=0;
       int high=k-1;
       double avg=0;
       double res=0;
       for(int i=0;i<k;i++)

       {
        sum+=nums[i];
        

       }
        avg=(double) sum/k;
        res=avg;
       for(int i=k;i<nums.length;i++)
       {
    sum=sum-nums[low];
    sum=sum+nums[high+1];
    low++;
    high++;
     avg=(double) sum/k;
    res=Math.max(res,avg);
       }
       return res;
      
    }
}