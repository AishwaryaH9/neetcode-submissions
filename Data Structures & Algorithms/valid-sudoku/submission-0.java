class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length;i++)
        {
            HashSet<Character> Rowset = new HashSet<>();
            for(int j = 0; j< board[i].length;j++)
            {
                if(board[i][j] != '.' && !Rowset.add(board[i][j]))
                    return false;
            }
        }
        for(int i = 0; i < board.length;i++)
        {
            HashSet<Character> Colset = new HashSet<>();
            for(int j = 0; j< board[i].length;j++)
            {
                if (board[j][i] != '.' && !Colset.add(board[j][i]))
                    return false;
            }
        }

        for(int row = 0; row < board.length;row+=3)
        {
            for(int col = 0;  col < board[row].length ;col+=3)
            {
                HashSet<Character> Squareset = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.' && !Squareset.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }




        
    return true;
    }
}
