class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n  = adj.size();

        boolean[] v = new boolean[n];
        dfs(0,adj,v);
        for(int i=0;i<n;i++)
        {
            if(!v[i])
            {
                return false;
            }
        }
        return true;
    }

    private void dfs(int node,List<List<Integer>> adj,boolean[] v)
    {
        v[node] = true;

        for(int n:adj.get(node))
        {
            if(!v[n])
            {
                dfs(n,adj,v);
            }
        }
    }
}