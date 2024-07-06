class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, i = 0, maxSum = nums[0];

        if (nums.length == 1)
            return nums[0];

        for (; i < nums.length; i++) {
            
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}