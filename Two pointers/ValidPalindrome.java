class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        String lower = s.toLowerCase();
        char[] strArr = lower.toCharArray();

        while (left < right) {
            while(!Character.isLetterOrDigit(strArr[left]) && left<right){
                left++;
            }
            while(!Character.isLetterOrDigit(strArr[right]) && left<right){
                right--;
            }
            
            if (strArr[left] != strArr[right]){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}