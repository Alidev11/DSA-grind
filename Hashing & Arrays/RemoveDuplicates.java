class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int j=0; j<nums.length; j++){
            freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);
        }
        for (Integer k : freqMap.keySet()){
            nums[i] = k;
            i++;
        }
        return freqMap.size();          
    }
}