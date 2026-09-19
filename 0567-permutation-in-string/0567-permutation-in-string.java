class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] original = s1.toCharArray();
        Arrays.sort(original);

        String sortedOriginal = new String(original);

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            if (right - left + 1 == s1.length()) {

                String window = s2.substring(left, right + 1);

                char[] c = window.toCharArray();
                Arrays.sort(c);

                String sortedWindow = new String(c);

                if (sortedWindow.equals(sortedOriginal)) {
                    return true;
                }

                left++;
            }
        }

        return false;
    }
}