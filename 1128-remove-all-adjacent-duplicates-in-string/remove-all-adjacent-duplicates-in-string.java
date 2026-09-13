class Solution {
    public String removeDuplicates(String s) {
        int i =0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(st.isEmpty() || ch != st.peek())
            {
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}