class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        String a = "";
        int j=n-1,i=0;
       while(i<j)
       {
        if(!Character.isLetter(arr[i]))
        {
            i++;
        }
        else if(!Character.isLetter(arr[j]))
        {
            j--;
        }
        else if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
              i++;
                j--;
        }
      
        }
       return new String(arr);
    }
}