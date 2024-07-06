class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0, finish = nums.length-1;
        
		while(start <= finish/2) {
			if(nums[start] + nums[finish] == target) {
        		return new int[]{start, finish};
        	}else if(nums[start] + nums[start+1] == target) {
        		return new int[]{start, start+1};
        	}else if(nums[finish] + nums[finish-1] == target) {
        		return new int[]{finish, finish-1};
        	}else {
        		start++;
        		finish--;
        	}
		}
        
        
		return new int[]{0, 0};
    }
}