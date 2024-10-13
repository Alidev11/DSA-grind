class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2)    return new int[] {0, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        int x=0;

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            x=target - nums[i];

            if(map.containsKey(x) && map.get(x)!=i){
                return new int[] {i, map.get(x)};
            }
        }

        
        return new int[] {-1, -1};
        
    }
}