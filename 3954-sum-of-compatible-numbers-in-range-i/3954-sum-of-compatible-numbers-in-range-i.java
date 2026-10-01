class Solution {
    public int sumOfGoodIntegers(int n, int k) {
       int left=((n-k)>0)?n-k:1;
       int sum=0;
       for(int i=left;i<=k+n;i++){
        if((n&i)==0) sum+=i;
       }
       return sum;
    }
}