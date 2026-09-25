class Solution {
    public int findCircleNum(int[][] adj) {
       int n = adj.length;
    int c=0;
       boolean[] v = new boolean[n];

       for(int i=0;i<n;i++)
       {
        if(!v[i])
        {
            dfs(i,adj,v);
            c++;
        }

       } 
       return c;
    }

    private void dfs(int node,int[][] adj,boolean[] v)
    {
        v[node] = true;
        for(int i=0;i<adj.length;i++)
        {
            if(adj[node][i] == 1 && !v[i])
            {
               dfs(i,adj,v);
            }
        }
    }
}