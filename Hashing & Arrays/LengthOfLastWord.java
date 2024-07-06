class Solution {
    public int lengthOfLastWord(String s) {
        int length=0, i=s.length()-1;
		for(; i>=0; i--) {
			if(length==0 && s.charAt(i) == ' ') {
				continue;
			}else {
				if(s.charAt(i) == ' ' && length!=0)	break;

				length++;
				
			}
		}
        return length;
    }
}