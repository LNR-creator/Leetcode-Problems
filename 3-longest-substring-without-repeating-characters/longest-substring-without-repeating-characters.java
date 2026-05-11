class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int left = 0;
        
        int maxl= 0;

        for(int right = 0;right < s.length();right++)
        {
            char ch = s.charAt(right);

            if(hm.containsKey(ch)){
                left = Math.max(left,hm.get(ch)+1);
            }
            
                hm.put(ch,right);
                maxl = Math.max(maxl,right-left+1);
            
        
        }
        return maxl;
    }
}