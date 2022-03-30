class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        
        if(matrix == null || m == 0 || n == 0) 
            return false;
        
        if(target > matrix[m-1][n-1] || target < matrix[0][0] ) 
            return false;
        
        while(i <= (m-1) && j >= 0) {
            if(matrix[i][j] == target) 
                return true;
            else if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}