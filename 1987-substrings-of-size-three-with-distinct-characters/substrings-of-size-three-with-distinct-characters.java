class Solution {
    public int countGoodSubstrings(String s) {
int low=0;
int res=0;
int high=2;
for(int i=0;i<=s.length()-3;i++)
{
    if(s.charAt(low)!=s.charAt(low+1)&&s.charAt(low+1)!=s.charAt(high)&&s.charAt(low)!=s.charAt(high))
    {
        res++;
    }
    low++;
    high++;

}
return res;
        
        
    }
}