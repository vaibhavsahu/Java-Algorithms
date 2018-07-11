package com.vaibhav.amazon;


import java.util.Scanner;

/*Matrix rotation by 90 degree clockwise
 1 2 3 4
 5 6 7 8
 9 10 11 12
 13 14 15 16

 After rotation
 13 9 5 1
 14 10 6 2
 15 11 7 3
 16 12 8 4

  */
public class Main {

    public static void main(String[] args) {

        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};


        for (int layer = 0; layer < arr.length/2; layer++) {

            int first = layer;
            int last = arr.length - layer - 1;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                //save top
                int top = arr[first][i];

                //top -> left
                arr[first][i] = arr[last-offset][first];

                //left -> bottom
                arr[last-offset][first] = arr[last][last-offset];
                

                //bottom -> right
                arr[last][last-offset] = arr[i][last];
                

                //right -> top
                arr[i][last] = top;
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //construct 2D array based on input size
        int [][] arrq = new int[N][N];

        int [] arr1 = new int[N];
        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }

        int [] arr2 = new int[N];
        for(int i = 0; i < N; i++){
            arr2[i] = sc.nextInt();
        }






    }
}
