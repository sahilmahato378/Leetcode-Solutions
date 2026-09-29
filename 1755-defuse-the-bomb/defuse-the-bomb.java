class Solution {
    public int[] decrypt(int[] code, int k) {
        int low=0;
        int high=0;
      
        int ans[]=new int[code.length];
        int n=code.length;
          if (k == 0) {
            return ans;
        }
        else if(k>0)
        {

         int sum=0;
        

        for(int i=1;i<=k;i++)
        {
          sum+=code[i%n];
        }
        
        for(int i=0;i<code.length;i++)
        {
            ans[i]=sum;
            sum-=code[(i+1)%n];
            sum+=code[(i+k+1)%n];
        }
        }
        else
        {
              int sum=0;
              for(int i=1;i<=-k;i++)
        {
          sum+=code[(n-i)%n];
        }
          for (int i = 0; i < n; i++) {
            ans[i]=sum;

           
sum -= code[(i - (-k) + n) % n];


sum += code[(i + n) % n];
          }
              

        }
        return ans;
        
    }
}