//You are given an m x n 2D image matrix where each integer represents a pixel.
//Flip it in-place along its vertical axis.

public static void flipItVerticalAxis(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols/2; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][cols - j - 1];
            matrix[i][cols - j -1 ] = temp;
        }
    }   
}