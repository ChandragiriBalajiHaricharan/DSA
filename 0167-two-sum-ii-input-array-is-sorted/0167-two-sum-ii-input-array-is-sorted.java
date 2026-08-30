class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] arr = new int[2];
        int left=0;
        int i=0;
        int right=numbers.length-1;
        while(left<right){
            if(left==right){
                continue;
            }
            if(numbers[left]+numbers[right] == target){
                arr[i]=left+1;
                arr[i+1]=right+1;
                break;
            }
            if(numbers[left]+numbers[right]<target){
                left++;
            }
            if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
        return arr;
    }
}