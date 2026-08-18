class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(char c : s.toCharArray())
        {
            int num = c - 96;

            sum += (num > 9 ) ? num/10 + num%10: num;
        }

        for(int i=1;i<k;i++)
        {
            int res = 0;
            while(sum>0)
            {
                res += sum%10;
                sum = sum/10; 
            }
            sum = res;
        }

        return sum;
    }
}