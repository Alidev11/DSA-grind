import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        if(m==0) {
			nums1[0]=nums2[0];
		}
		for(int i=m; i<nums1.length; i++) {
			nums1[i]=nums2[j];
			j++;
		}
        Arrays.sort(nums1);

    }
}