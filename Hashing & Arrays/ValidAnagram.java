class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        char[] countS = new char[26];
        char[] countT = new char[26];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i=0; i<sArr.length; i++){
            countS[sArr[i]-'a']++;
            countT[tArr[i]-'a']++;
        }

        for(int i=0; i<countS.length; i++){
            if(countS[i]!=countT[i])    return false;
        }

        return true;
    }
}