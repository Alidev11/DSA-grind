class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        
        System.arraycopy(nums, 0, newArr, 0, nums.length);
        System.arraycopy(nums, 0, newArr, nums.length, nums.length);
		return newArr;
    }
}