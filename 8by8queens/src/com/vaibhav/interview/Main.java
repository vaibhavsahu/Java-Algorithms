package com.vaibhav.interview;

import java.util.ArrayList;

public class Main {
    public static final int GRID_SIZE = 8;

    public static boolean validPosition(Integer [] cols, int row1,int col1){
        for (int i = 0; i < row1; i++) {
            int col2 = cols[i];

            if(col1 == col2) return false;

            int colDistance = Math.abs(col1-col2);

            int rowDistance()
        }
    }

    public static void placeQueens(int row, Integer [] cols, ArrayList<Integer[]> results){
        if(row == GRID_SIZE) results.add(cols.clone());
        else{
            for(int col = 0; col < GRID_SIZE; col++){
                if(validPosition(cols, row, col)){
                    cols[row] = col;
                    placeQueens(row+1, cols, results);
                }
            }
        }

    }


    public static void main(String[] args) {
        Integer [] cols = {0, 1, 2, 3, 4, 5, 6, 7};    
        ArrayList<Integer> results = new ArrayList<Integer>();
        placeQueens(0, cols, results);

    }
}
