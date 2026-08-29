class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int first = 0;
        int longest = 0;

        if (!set.isEmpty()) {
            first = set.iterator().next();
        }

        for (int i = first; !set.isEmpty(); ) {

            if (set.contains(i)) {
                set2.add(i);
                set.remove(i);
                i++;
            }
            else {
                longest = Math.max(longest, set2.size());
                set2.clear();

                if (!set.isEmpty()) {
                    i = set.iterator().next();
                }
            }
        }

        longest = Math.max(longest, set2.size());

        return longest;
    }
}