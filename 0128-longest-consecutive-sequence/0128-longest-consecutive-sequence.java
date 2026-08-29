import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int pedda = 1;
        int ippudu = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                ippudu++;
            } 
            else {
                ippudu = 1;
            }

            pedda = Math.max(pedda, ippudu);
        }

        return pedda;
    }
}