class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
        }
        if(nums.length==1){
            return nums[0];
        }
        return sum;
    }
    }