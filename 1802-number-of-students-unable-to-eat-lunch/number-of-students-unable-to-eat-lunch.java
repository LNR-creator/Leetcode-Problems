class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        // Stack<Integer> s = new Stack<>();

        for(int i=0;i<students.length;i++)
        {
            q.add(students[i]);
        }

        // for(int i=sandwiches.length - 1;i>=0;i--)
        // {
        //     s.push(sandwiches[i]);
        // }
        int c = 0;
        // for(int i=0;i<students.length;i++)
    int i =0;
        while(!q.isEmpty() && c < q.size())
        {
            // int a = s.pop();
            // int b = q.peek();

            // if(a == b)
            // {
            //     c++;
            // }

            if(q.peek() == sandwiches[i])
            {
                
                q.poll();
                c = 0;
                i++;

            }else
            {
                q.offer(q.poll());
                c++;
            }
        }
        return q.size();


    }
}