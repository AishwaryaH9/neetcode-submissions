class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int maxArea = 0;
        int[][] dirs = new int [][]
        {
           {1,0},
            {-1,0},
            {0,1},
            {0,-1},
        };
        int rows = grid.length;
        int col = grid[0].length;
        int area = 0;
        for(int i = 0 ; i < rows;i++)
        {
            for(int j = 0; j < col;j++)
            {
                if(grid[i][j] == 1)
                {
                    queue.offer(new int[]{i,j});
                    grid[i][j] = 0;
                    area++;
                    
                    while(!queue.isEmpty())
                    {
                        int[] curr = queue.poll();
                    for(int[] dir : dirs)
                    {
                        int nr = curr[0] + dir[0];
                        int nc = curr[1] + dir[1];
                        if(nc>=0 && nr >=0 && nr<rows && nc<col && grid[nr][nc] == 1)
                        {
                        area++;
                        grid[nr][nc] = 0;
                        queue.offer(new int[]{nr,nc});
                       
                        }
                    }
                    
                    }
                }
                maxArea = Math.max(maxArea,area);
                area = 0;
            }
        }

        return maxArea;
        
    }
}
