class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right=0, maxLen=0, max=0;
        int[] count = new int[26];
        char[] sArr = s.toCharArray();
        
        for(;right<sArr.length; right++){
            count[sArr[right] - 'A']++;
            
            max = Math.max(max, count[sArr[right] - 'A']);

            if(right-left+1 - max > k){
                count[sArr[left] - 'A']--;
                left++;
            }else{
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}