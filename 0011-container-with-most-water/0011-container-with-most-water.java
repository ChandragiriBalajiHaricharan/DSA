class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int area=0;
        int highest=0;
        for(int i=0;i< height.length;i++){
            area = (right - left) * Math.min(height[left], height[right]);
            highest= Math.max(highest,area);
            if(height[left]==height[right]){
                left++;
                right--;
            }
            else if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
    }
    return highest;
}
}