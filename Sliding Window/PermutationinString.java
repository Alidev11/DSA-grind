class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0, winSize = s1.length(), count = 0;
        int[] countS1 = new int[26];
        int[] countSubS2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            countS1[s1.charAt(i) - 'a']++;
        }

        while (right < s2.length()) {
            countSubS2[s2.charAt(right) - 'a']++;
            if (right - left + 1 == winSize) {
                for (int i = 0; i < countS1.length; i++) {
                    if (countS1[i] != 0 && countSubS2[i] == countS1[i]) {
                        count += countS1[i];
                    }
                }
                if (count == s1.length()) {
                    return true;
                } else {
                    countSubS2[s2.charAt(left) - 'a']--;
                    left++;
                }
            }
            right++;
            count = 0;
        }
        return false;
    }
}