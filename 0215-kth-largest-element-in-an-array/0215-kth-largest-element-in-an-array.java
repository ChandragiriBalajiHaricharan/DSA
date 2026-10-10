class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ep = new PriorityQueue<>();
        for(int x: nums){
            ep.add(x);
            if(ep.size()>k) ep.remove();
        }
        return ep.peek();
    }
}