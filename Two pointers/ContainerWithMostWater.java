class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxVolume = 0;
        while (i <= j) {
            int volume = Math.min(height[i], height[j]) * (j - i);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
            maxVolume = Math.max(volume, maxVolume);
        }
        return maxVolume;
    }
}