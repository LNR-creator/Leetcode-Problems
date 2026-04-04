class Solution {
    public int reverse(int x) {
        int digit = 0;
        int pos = Math.abs(x);
        int result = 0;
        while(pos>0){

            digit = pos%10;
            if(result > (Integer.MAX_VALUE - digit)/10){
                return 0;
            }
            result = result*10 + digit;
            pos = pos/10;
            
        }
        return (x<0)? -result:result;
        
    }
}