class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;
        int currentLength = 0;

        if (!set.isEmpty()) {
            int i = set.iterator().next();

            while (!set.isEmpty()) {

                if (set.contains(i)) {
                    currentLength++;
                    set.remove(i);
                    i++;
                } 
                else {
                    longest = Math.max(longest, currentLength);
                    currentLength = 0;

                    if (!set.isEmpty()) {
                        i = set.iterator().next();
                    }
                }
            }
        }

        longest = Math.max(longest, currentLength);

        return longest;
    }
}