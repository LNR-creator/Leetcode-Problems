class Solution {
    public int numberOfSubstrings(String s) {
        int[] fre = new int[3];

        int l = 0;int c = 0;

        for(int r = 0;r<s.length();r++)
        {
            fre[s.charAt(r) - 'a']++;
            while(fre[0]>0 && fre[1]>0 && fre[2]>0){
                c += s.length() - r;

                fre[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return c;
    }
}