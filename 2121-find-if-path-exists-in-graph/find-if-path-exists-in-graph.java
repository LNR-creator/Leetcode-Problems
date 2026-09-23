class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] v = new boolean[n];

        v[start] = true;
        bfs(adj,n,v,start,end);
        return v[end];
    }

    private void bfs(List<List<Integer>> adj,int n,boolean[] v,int start,int end)
    {
        // v[0] = true;
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while(!q.isEmpty())
        {
            int node = q.poll();

          for(int neigh:adj.get(node))
          {
            if(!v[neigh])
            {
                v[neigh] = true;
                q.add(neigh);
            }
          }
        }


    }
}