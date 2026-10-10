class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ep = new PriorityQueue<>();
        for(int x: nums){
            ep.add(x);
            if(ep.size()>k) ep.remove();
        }
        // int count=0,pre=ep.remove();
        // while(!ep.isEmpty() && count<k){
        //     if(ep.peek()!=pre){
        //         count++;
        //         pre=ep.remove();
        //     } else {
        //         pre=ep.remove();
        //     }

        // } 
        // ep.remove();
        return ep.peek();
    }
}