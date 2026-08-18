class Solution {
    public String reverseWords(String s) {
       String[] str = s.split(" ");
       StringBuilder sb = new StringBuilder();

    for(int i=0;i<str.length;i++)
    {
        String a = str[i];
       for(int j = a.length()-1;j>=0;j--)
       {
            sb.append(a.charAt(j));
       }
       if(i<str.length-1)
       {
       sb.append(" ");
       }
    }
    return sb.toString();
  }
}