class Solution {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> map = new HashSet<>();
        for(int i: nums){
            map.add(i);
        }
        if(nums.length!= map.size()){
            return true;
        }
        else{
            return false;
        }
    }
    }