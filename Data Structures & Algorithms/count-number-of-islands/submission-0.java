class Solution {
    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int noOfIsalands = 0;
        for(int i = 0 ; i < row;i++)
        {
            for(int j =0; j < col;j++)
            {
                if(grid[i][j] == '1')
                {
                    noOfIsalands++;
                    dfs(grid,i,j);

                }
            }
        }
        return noOfIsalands;
    }

    private void dfs(char[][] grid, int r, int c)
    {
        if(r <0 || c < 0|| r >= grid.length || c >= grid[r].length ||  grid[r][c] == '0')
            return;
        grid[r][c] = '0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);

        
    }
}
