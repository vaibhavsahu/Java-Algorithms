package com.vaibhav.amazon;

public class Main {
    public static void flipArray(int [][] arr){
        //int layer = arr.length/2;
        for (int i = 0; i < arr.length; i++) {
            //int first = 0;
            //int last = arr.length - i - 1;

            for (int j = 0; j < arr.length/2; j++) {
                //int offset = j - first;

                int temp = arr[i][j];
                //System.out.println(i + " " + j);
                arr[i][j] = arr[i][arr.length - 1- j];
                //System.out.println((arr.length - 1 - i) + " " + j);
                arr[i][arr.length - 1- j] = temp;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] arr = {{1, 0},{1,0}};

        flipArray(arr);

    }
}
