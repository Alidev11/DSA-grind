xclass Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> win = new LinkedList<>();
        int maxSize = 0;
        if (s.length() == 1)
            return 1;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!win.contains(c)) {
                win.add(c);  
            } else {
                while(win.contains(c))  win.poll();
                win.add(c);
            }
            maxSize = Math.max(maxSize, win.size());
        }
        return maxSize;
    }
}