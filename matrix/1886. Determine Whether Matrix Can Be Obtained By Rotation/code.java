 class Solution {
    private boolean compateMatrix(int [][]mat, int [][]tar)
    {
        int n = mat.length;
        for(int i = 0; i< n; i++)
        {
            for(int j = 0; j< n; j++)
            {
                if(mat[i][j] != tar[i][j])
                    return false;
            }
        }
        return true;
    }
    private void rotateMatrix(int [][]mat)
    {
        int n = mat.length;
        for(int i = 0; i< n; i++)
        {
            for(int j = i; j< n; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(int i = 0; i< n; i++)
            for(int j = 0 ; j< n/2; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(compateMatrix(target, mat))
            return true;
        
        for(int i = 0; i< 3; i++)
        {
            rotateMatrix(mat);
            if(compateMatrix(target, mat))
            return true;
        }
        return false;  
    }
}