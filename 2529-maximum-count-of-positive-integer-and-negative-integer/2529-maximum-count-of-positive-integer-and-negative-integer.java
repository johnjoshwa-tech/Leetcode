class Solution {

    public int maximumCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = 0, max = 0;
        while (left <= right) {
            int mid = left - (left - right) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        min = left;
        right=nums.length-1;
        while (left <= right) {
            int mid = left - (left - right) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else
                left = mid + 1;
        }
        max = nums.length - right-1;
        if (max > min)
            return max;
        return min;
    }
}