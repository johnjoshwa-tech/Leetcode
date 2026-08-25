class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean flag=true;
        int n=1;
        while(flag)
        {
            flag=false;
            for(int i=0;i<nums.length;i++)
            {
                if(k*n==nums[i])
                {
                   flag=true;
                   break;
                }
        }
        n++;
        }
        return k*(n-1);
    }
}