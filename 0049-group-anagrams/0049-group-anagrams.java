class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] ch = strs[i].toCharArray();

            Arrays.sort(ch);

            String sortedWord = new String(ch);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}