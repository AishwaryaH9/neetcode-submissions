class Solution {
    public void islandsAndTreasure(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        int[][] dirs =
        {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        for(int i = 0;  i < row; i++)
        {
            for(int j =0 ; j < col;j++)
            {
               if(grid[i][j] == 0)
                    q.offer(new int[] {i,j});
            }
        }

        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            for(int[] dir : dirs)
            {
                int nr = curr[0] + dir[0];
                int nc = curr[1] + dir[1];

                if(nc < 0 || nr < 0 || nr >= row || nc >= col)
                    continue;
                
                if(grid[nr][nc] != Integer.MAX_VALUE)
                    continue;
                
                grid[nr][nc] = grid[curr[0]][curr[1]] + 1;

                q.offer(new int[]{nr, nc});

            }
        }
    }

    
}
