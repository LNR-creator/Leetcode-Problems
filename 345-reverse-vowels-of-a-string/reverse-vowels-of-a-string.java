class Solution {
    public String reverseVowels(String s) {
        int i =0,j=s.length()-1;
        char[] arr = s.toCharArray();
        
        while(i<j)
        {
        while(i<j && !isVowel(arr[i]))
        {
            i++;
            
        }   

        while(i<j && !isVowel(arr[j]))
        {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       i++;j--;
        }
        return new String(arr);
    }

    public static boolean isVowel(char a)
    {
            return "aeiouAEIOU".indexOf(a) != -1;
    }
}