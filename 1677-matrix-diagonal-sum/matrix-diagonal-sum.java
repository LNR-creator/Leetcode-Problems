class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                {
                    sum += mat[i][j];
                }
                if(i+j == n-1)
                {
                    if(n%2 != 0)
                    {
                        if(i == n/2 && j == n/2){
                            continue;
                        }
                    }
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}