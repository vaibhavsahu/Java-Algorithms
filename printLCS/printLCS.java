import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printLCS(int [] arr1, int [] arr2, int m, int n){

        int [][] result = new int[m+1][n+1];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (arr1[i] == arr2[j])
                    result[i+1][j+1] = result[i][j] + 1;
                else
                    result[i+1][j+1] =
                            Math.max(result[i+1][j], result[i][j+1]);
        List<Integer> list = new ArrayList<>();
        for (int x = m, y = n;
             x != 0 && y != 0; ) {
            if (result[x][y] == result[x-1][y])
                x--;
            else if (result[x][y] == result[x][y-1])
                y--;
            else {
                assert arr1[x-1] == arr2[y-1];
                list.add(arr1[x-1]);
                x--;
                y--;
            }
        }
        list.stream().forEach(e -> System.out.print(e+ " "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        
        int [] arr1 = new int[len1];
        int [] arr2 = new int[len2];
        
        for(int i = 0; i < len1; i++){
            arr1[i] = sc.nextInt();
        }
        
         for(int j = 0; j < len2; j++){
            arr2[j] = sc.nextInt();
        }
        
        printLCS(arr1, arr2, len1, len2);
        
        sc.close();
        
    }
}
