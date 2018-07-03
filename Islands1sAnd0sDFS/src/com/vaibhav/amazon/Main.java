package com.vaibhav.amazon;


class Islands{
    static int ROWS = 5;
    static int COLS = 5;

    int [][] mat = new int[ROWS][COLS];

    boolean [][] visited = new boolean[ROWS][COLS];

    public boolean isSafe(int [][] arr, int i, int j){
        if(i < ROWS && j < COLS && i >= 0 && j >= 0 && visited[i][j] == false && arr[i][j] == 1)
            return true;
        else
            return false;
    }

    public void DFS(int [][] arr, int i, int j){
        int [] robNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int [] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};

        visited[i][j] = true;//comment this line to see for stack overflow error
        //run DFS on each of 8 neighbors of each cell
        for (int k = 0; k < 8; k++) {
                //check if cell is safe to run DFS
                if(isSafe(arr, i + robNbr[k], j + colNbr[k])){
                    DFS(arr, i + robNbr[k], j + colNbr[k]);
                }
        }

    }

    public int countIslands(int [][] arr){
        int count = 0;
        //run DFS on every element of the input array
        for (int k = 0; k < ROWS; k++) {
            for (int l = 0; l < COLS; l++) {
                if(arr[k][l] == 1 && !visited[k][l]) {
                    DFS(arr, k, l);
                    count++;
                }
            }
        }
        return count;
    }

}

public class Main {

    public static void main(String[] args) {
	int [][] arr = {{1,1,0,0,0},
                    {0,1,0,0,1},
                    {1,1,1,1,1},
                    {0,1,0,0,0},
                    {1,0,1,0,1}};
	Islands I = new Islands();

	int count = I.countIslands(arr);
        System.out.println(count);
    }
}
