class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<tickets.length;i++)
       {
        q.add(i);
       }
        int s = 0;
       while(!q.isEmpty())
        {
            s++;
            int person = q.poll();
            if(tickets[person] >= 1)
            {
               tickets[person]--;
               
            }

            if(person == k && tickets[person] == 0)
            {
                break;
            }

            if(person != k && tickets[person] == 0)
            {
                continue;
            }

        q.add(person);
        }

        return s;
    }
}