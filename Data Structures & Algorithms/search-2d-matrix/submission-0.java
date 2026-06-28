class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start =0;
        int end = 0;
        int mid = 0;
        int j = 0;;
        for(int i = 0; i < matrix.length ;i++)
        {
            if(matrix[i][0] <= target && matrix[i][matrix[i].length -1] >= target)
            {
                start = 0;
                end = matrix[i].length -1;

                while(start <= end)
                {
                    mid = ( start + end ) / 2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] < target)
                        start = mid + 1;
                    else
                        end = mid - 1;;
                }
                return false;
            }
        }
        return false;
    }
}
