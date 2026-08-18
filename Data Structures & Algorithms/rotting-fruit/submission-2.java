class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        if(row == 0 )
            return -1;
        int col = grid[0].length;
        int noofMinutes=0;

        int[][] dirs = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        Queue<int[]> queue = new LinkedList<int[]>();
        int freshFruits = 0;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col;j++)
            {
               
                if(grid[i][j] == 2)
                {
                    queue.offer(new int[] {i,j});
                }
                else if(grid[i][j] == 1)
                {
                    freshFruits++;
                }
            }
        }

            while(!queue.isEmpty() && freshFruits > 0)
            {
               int size = queue.size();

for(int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                for(int[] dir : dirs)
                {
                    int nr = curr[0] + dir[0];
                    int nc = curr[1] + dir[1];
                    if(nr >= 0 && nc >= 0 && nr < row &&
                            nc < col && grid[nr][nc] == 1)
                    {
                        grid[nr][nc] = 2;
                        queue.offer(new int[]{nr, nc});
                        freshFruits--;
                    }
                }
}
                noofMinutes++;
                System.out.println("noofMinutes " + noofMinutes);
            }
            if (freshFruits > 0)
                return -1;

        return noofMinutes;







    }
}
