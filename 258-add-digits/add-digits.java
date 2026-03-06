class Solution {
    public int addDigits(int n) {
       return 1+(n-1)%9;
        // while(n>=9)
        // {
        //    int sum=0;
        //    while(n>0)
        //    {
        //     int d = n%10;
        //     sum += d;
        //     n/=10;
        //    }
        //    n = sum;
        // }
        // return n;
    }
}