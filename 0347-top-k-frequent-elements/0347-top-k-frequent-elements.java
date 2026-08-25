import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i = 0; i < k; i++){
            list1.add(list.get(i));
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = list1.get(i);
        }

        return result;
    }
}