import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_test_cases = sc.nextInt();
        for (int i = 0; i < num_of_test_cases; i++) {
            int size = sc.nextInt();
            int[][] arr = new int[size][size];
            boolean [][] visited = new boolean[size][size];
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int result = countIslands(arr, visited);
            System.out.println(result);
        }
    }

        public static int countIslands(int [][] arr, boolean [][] visited){
            int count = 0;
            //run DFS on every element of the input array
            for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr.length; l++) {
                    if(arr[k][l] == 1 && !visited[k][l]) {
                        DFS(arr, k, l, visited);
                        count++;
                    }
                }
            }
            //System.out.println(count);
            return count;
        }

    public static boolean isSafe(int [][] arr, int i, int j, boolean [][] visited){
        if(i < arr.length && j < arr.length && i >= 0 && j >= 0 && visited[i][j] == false && arr[i][j] == 1)
            return true;
        else
            return false;
    }

    public static void DFS(int [][] arr, int i, int j, boolean [][] visited){
        int [] robNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int [] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};

        visited[i][j] = true;//comment this line to see for stack overflow error
        //run DFS on each of 8 neighbors of each cell
        for (int k = 0; k < 8; k++) {
            //check if cell is safe to run DFS
            if(isSafe(arr, i + robNbr[k], j + colNbr[k], visited)){
                DFS(arr, i + robNbr[k], j + colNbr[k], visited);
            }
        }
    }
}
