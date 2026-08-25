class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(s1.length!=s2.length){
            return false;
        }
        for(int i=0;i<s1.length;i++){
            map1.put(s1[i], map1.getOrDefault(s1[i], 0) + 1);
            map2.put(s2[i], map2.getOrDefault(s2[i], 0) + 1);
        }
        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}