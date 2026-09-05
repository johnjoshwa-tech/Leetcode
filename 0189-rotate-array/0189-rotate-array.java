class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] arr=new int[nums.length];
        for(int i=0;i<k;i++){
            arr[i]=nums[nums.length-k+i];
        }
        for(int i=0;i<nums.length-k;i++){
            arr[i+k]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}