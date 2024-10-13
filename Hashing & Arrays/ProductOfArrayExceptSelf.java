class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] prefix = new int[nums.length]; 
        int[] suffix = new int[nums.length];

        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);

        prefix[0] = nums[0];
        suffix[nums.length-1] = nums[nums.length-1];

        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i] * prefix[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = nums[i] * suffix[i+1];
        }

        res[0] = suffix[1];
        res[nums.length-1] = prefix[nums.length-2];

        for(int i=1; i<nums.length-1; i++){
            res[i] = prefix[i-1] * suffix[i+1];
        }

        

        return res;
    }
    
}