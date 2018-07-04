//You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.

public static void flipHorizontalAxis(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    for(int i = 0; i < rows/2; i++){
        for(int j = 0; j < cols; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[rows - i - 1][j];
            matrix[rows - i - 1][j] = temp;
            
        }
    }
}