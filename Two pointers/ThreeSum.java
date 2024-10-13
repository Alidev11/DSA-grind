class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            int left = i+1, right = nums.length-1;
            if(i>0 && (nums[i] == nums[i-1])) continue;
            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    res.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    while((nums[left] == nums[left-1]) && left<right) left++;
                }else if(nums[i] + nums[right] + nums[left] > 0){
                    right--;                    
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}
