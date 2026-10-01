class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int low=0;
        int high=0;
        int sum=0;
        int extra=0;
        int maxextra=0;
        for(high=0;high<customers.length;high++)
        {
            if(grumpy[high]==0)
            {
                sum+=customers[high];
            }
             if(grumpy[high]==1)
              {
                extra+=customers[high];
              }
            if(high-low+1==minutes)
            {
                maxextra=Math.max(extra,maxextra);
              if(grumpy[low]==1)
              {
                extra-=customers[low];
              }
             
              
              
               low++;
        }
        }
        return sum+maxextra;
             
            
        
    }
}