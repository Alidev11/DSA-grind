class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] toChar = strs[i].toCharArray();
            Arrays.sort(toChar);
            String str = new String(toChar);

            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str, list);
            }
        }

        return map.values().stream().collect(Collectors.toList());
    }
}