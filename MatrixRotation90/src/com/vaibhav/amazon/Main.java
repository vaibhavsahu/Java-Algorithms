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
                //System.out.println("offset: " + offset);

                //save top
                //System.out.println("top");
                //System.out.println("(" + first + ", " + i + ")");
                int top = arr[first][i];

                //top -> left
                //System.out.println("top -> left");
                //System.out.println("(" + (last - offset) + ", " + first + ")");
                arr[first][i] = arr[last-offset][first];
                //System.out.println("updated top: " + arr[first][i]);

                //left -> bottom
                //System.out.println("left -> bottom");
                //System.out.println("(" + last + ", " + (last-offset) + ")");
                arr[last-offset][first] = arr[last][last-offset];
                //System.out.println("updated left: " + arr[last-offset][first]);

                //bottom -> right
                //System.out.println("bottom -> right");
                //System.out.println("(" + i + ", " + last + ")");
                arr[last][last-offset] = arr[i][last];
                //System.out.println("updated bottom: " + arr[last][last-offset]);

                //right -> top
                //System.out.println("right -> top");
                arr[i][last] = top;
                //System.out.println("updated right: " + arr[i][last]);
            }
        }

        //print matrix after 90 degree clockwise rotation
       // for (int i = 0; i < 4; i++) {
         //   for (int j = 0; j < 4; j++) {
             //   System.out.print(arr[i][j]+ " ");
           // }
            //System.out.println();
        //}
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
