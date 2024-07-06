class Solution {
    public int removeElement(int[] nums, int val) {
        int i = nums.length-1, j = nums.length-1, inc=0;
        while(i>=0){
            if(nums[i]==val){
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                j--;
                inc++;
            }
            i--;
        }
        return nums.length - inc;
    }
}