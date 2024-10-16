class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, maj = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i]) {
                count++;
            } else {
                count--;
                if (count == -1) {
                    maj = nums[i];
                    count = 1;
                }
            }
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return maj;
    }
}