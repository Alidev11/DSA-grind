class Solution {
    public boolean isAnagram(String s, String t) {
        int i=0;
        if(s.length()!= t.length())    return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}