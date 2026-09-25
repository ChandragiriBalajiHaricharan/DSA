class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAverage = (double) sum / k;

        // Slide the window
        for (int right = k; right < nums.length; right++) {

            sum = sum - nums[left] + nums[right];
            left++;

            double average = (double) sum / k;

            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}