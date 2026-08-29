class Solution {
    public boolean isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
        char [] c= cleanText.toCharArray();
        int left=0;
        int right=c.length;
        boolean valid=true;
        for(left=0;left<right;left++){
            right--;
            if(c[left]==c[right]){
                continue;
            }
            if(c[left]!=c[right]){
                valid=false;
            }
            
        }
        return valid;
    }
}
