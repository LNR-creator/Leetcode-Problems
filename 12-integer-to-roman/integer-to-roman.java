class Solution {
    public String intToRoman(int n) {
       String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
       int[] val = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String res = "";
         for(int i=roman.length-1;i>=0;i--)
        {
           while(n>=val[i])
            {  
                    n -= val[i];
                    res += ""+roman[i];
            }
        }

        return res;


    }
}