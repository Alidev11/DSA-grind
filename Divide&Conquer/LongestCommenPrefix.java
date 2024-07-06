class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp1 = strs[0], lcp2 = strs[strs.length-1], lcp3 = "", tmp="";
		int i = 1, j = strs.length - 2, mid=(strs.length/2);

		while (i <= mid ){
			for (int h = 0; h < Math.min(strs[i].length(), lcp1.length()); h++) {
				if (strs[i].charAt(h) != lcp1.charAt(h)) {
					break;
				} else {
					tmp+=lcp1.charAt(h);	
				}
			}
			lcp1=tmp;
			tmp="";
			i++;

			for (int h = 0; h < Math.min(strs[j].length(), lcp2.length()); h++) {
				if(strs[j].charAt(h) != lcp2.charAt(h)) {
					break;
				}else {
					tmp+=lcp2.charAt(h);
				}
			}
			
			lcp2=tmp;
			tmp="";
			j--;
		}
		
		
		for (int h = 0; h < Math.min(lcp1.length(), lcp2.length()); h++) {
			if (lcp1.charAt(h) == lcp2.charAt(h)) {
				lcp3 += lcp1.charAt(h);
			} else {
				break;
			}
		}
		return lcp3;
    }
}