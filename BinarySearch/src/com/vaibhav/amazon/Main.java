package com.vaibhav.amazon;

public class Main {

    public static boolean binarySearch(int [] arr, int n){
        if(arr.length == 0){
            return false;
        }else if(arr.length == 1){
            if(arr[0] == n){
                return true;
            }else{
                return false;
            }
        }else{
            int low = 0;
            int high = arr.length -1;
            int mid = low + high / 2;
            if(arr[mid] == n){
                return true;
            } else if(arr[mid] > n){
                high = mid - 1;
                return binarySearchUtil(arr, low, high, n);
            }else{
                low = mid + 1;
                return binarySearchUtil(arr, low, high, n);
            }
        }
    }

    public static boolean binarySearchUtil(int [] arr, int low, int high, int n){
        int mid = low + (high-low) / 2;
        if( low <= high){
        if(arr[mid] == n){
            return true;
        } else if(arr[mid] > n){
            high = mid - 1;
            return binarySearchUtil(arr, low, high, n);
        }else{
            low = mid + 1;
            return binarySearchUtil(arr, low, high, n);
        }
        }
        return false;
    }

    public static void main(String[] args) {
	int [] arr = {2, 5, 7, 9, 12};
        System.out.println(binarySearch(arr, 8));
    }
}
