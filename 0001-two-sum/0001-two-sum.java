import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target-nums[i];
            if(map1.containsKey(needed)){
                return new int[]{map1.get(needed), i};
            }
            map1.put(nums[i],i);
        }
        return new int[]{};
    }
}
