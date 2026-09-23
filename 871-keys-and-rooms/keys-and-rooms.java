class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        bfs(adj,0,visited);

        for(boolean ele:visited)
        {
            if(ele == false)
                return false;
            
        }

        return true;
    }

    private void bfs(List<List<Integer>> adj,int start,boolean[] visited )
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        
        while(!q.isEmpty())
        {
            int node = q.poll();
            for(int a : adj.get(node))
            {
                if(!visited[a])
                {
                    visited[a] = true;
                    q.add(a);
                }
            }
        }
    } 
}