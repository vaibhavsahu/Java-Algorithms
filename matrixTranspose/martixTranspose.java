public static void transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix.length;
    
    for(int i = 0; i < rows; i++){
        for(int j = i + 1; j < cols; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}