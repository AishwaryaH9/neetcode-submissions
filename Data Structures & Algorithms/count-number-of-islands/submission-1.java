class Solution {
    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int noOfIsalands = 0;

        Queue<int[]> q = new LinkedList<>();

        int[][] dirs = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1},
        };

        for(int i = 0 ; i < row;i++)
        {
            for(int j =0; j < col;j++)
            {
                if(grid[i][j] == '1')
                {
                   noOfIsalands++;
                   grid[i][j] = '0';
                   q.offer(new int[] {i,j});
                   while(!q.isEmpty())
                   {
                        int[] curr = q.poll();
                        for(int[] dir : dirs)
                        {
                            int nr = curr[0] + dir[0];
                            int nc = curr[1] + dir[1];

                            if(nc>=0 && nr >=0 && nr<row && nc<col && grid[nr][nc] == '1')
                            {  
                                grid[nr][nc]='0';
                                q.offer(new int[]{nr,nc});
                            }
                        }
                   }

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
