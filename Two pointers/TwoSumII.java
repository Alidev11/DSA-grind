class Solution {
    public int[] twoSum(int[] numbers, int target) {
		int i= 0, j= (numbers.length)-1, l= numbers[i], r= numbers[j];
        int[] arr = {0,0};
		while(l<=r) {
			if(l+r == target) {
                arr[0]=i+1;
                arr[1]=j+1;
				return arr;
			}else if(l+r>target) {
				r=numbers[--j];
			}else {
				l=numbers[++i];
			}
		}
		return arr;
    }
}