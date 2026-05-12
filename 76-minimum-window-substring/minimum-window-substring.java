import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // Store frequency of characters from t
        for(char c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If character exists in map
            if(hm.containsKey(ch)) {

                hm.put(ch, hm.get(ch) - 1);

                // Valid required character matched
                if(hm.get(ch) >= 0) {
                    count++;
                }
            }

            // Window is valid
            while(count == t.length()) {

                // Update minimum window
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                // Restore frequency while shrinking
                if(hm.containsKey(leftChar)) {

                    hm.put(leftChar, hm.get(leftChar) + 1);

                    // Required character removed
                    if(hm.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}