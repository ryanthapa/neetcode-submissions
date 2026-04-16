class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(res.containsKey(sorted)){
                res.get(sorted).add(s);
            }else{
                List list = new ArrayList<>();
                list.add(s);
                res.put(sorted,list);
            }
        }
        return new ArrayList<>(res.values());
    }
}
