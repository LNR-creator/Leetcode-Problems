class Solution {
    public long countCommas(long n) {
        long c = 0;

        if(n<1_000){
            return 0;
        } 
        if(n>=1_000)
        {
            c += n-999;
        }
        if(n>=1_000_000)
        {
            c += n-999_999;
        }
        if(n>=1_000_000_000)
        {
            c += n - 999_999_999;
        }
        if(n>=1_000_000_000_000L)
        {
            c += n - 999_999_999_999L;
        }
        if(n>= 1_000_000_000_000_000L)
        {
            c += n - 999_999_999_999_999L;
        }

        return c;
    }
}