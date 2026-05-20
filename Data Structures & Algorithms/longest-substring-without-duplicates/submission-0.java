class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet <>();
        int left = 0;
        int maxlen = 0;

        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(curr);
            maxlen = Math.max(maxlen, i -left +1);
        }
        return maxlen;   
    }
}
