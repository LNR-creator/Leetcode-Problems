class Solution {
    public int romanToInt(String s) {
        int ans =0;
        for(int i=s.length()-1;i>=0;i--)
        {
           int a = val(s.charAt(i));

           if(i<s.length()-1 && a < val(s.charAt(i+1)))
           {
            ans -= a;
           }
           else{
            ans += a;
           }
        }
        return ans;
    }

    private int val(char ch)
    {
        switch (ch)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'M': return 1000;
            case 'L' : return 50;
            case 'D': return 500;
            case 'C':return 100;
            case 'X':return 10;
        }
        return 0;
    }
}