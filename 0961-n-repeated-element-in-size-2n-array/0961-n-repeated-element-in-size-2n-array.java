class Solution {
    public int repeatedNTimes(int[] nums) {
      Arrays.sort(nums);  
      for(int i=0;i<=nums.length/2;i++){
        if(nums[i]==nums[i+1]) return nums[i];
      }
      return -1;
    }
}