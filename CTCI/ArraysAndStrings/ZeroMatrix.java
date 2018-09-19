package com.vaibhav.interview;

public class Main {

    public static void setZeroMatrix(int [][] arr){

        boolean [] row = new boolean[arr.length];
        boolean [] col = new boolean[arr[0].length];

        //iterate over the matrix to check for 0's present
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        //Nullify rows
        for(int i =0; i < row.length; i++){
            if(row[i]) NullifyRow(arr, i);
        }



        //nullify columns
        for(int j =0; j < col.length; j++){
            if(col[j]) NullifyCol(arr, j);
        }



    }


    public static void NullifyRow(int [][] matrix, int row){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }


    public static void NullifyCol(int [][] matrix, int col){
        for(int j = 0; j < matrix.length; j++){
            matrix[j][col] = 0;
        }
    }

    public static void main(String[] args) {
	int [][] intArray = {{1, 0, 3, 5}, {4, 3, 2, 0}, {0, 8, 6, 1}, {1, 2, 0, 5}, {1, 1, 1, 1}};

	setZeroMatrix(intArray);

	for(int [] i: intArray){
	    for(int j : i){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
    }
}
