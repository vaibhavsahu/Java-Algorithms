/*
Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.

findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
*/

public static int findMissingNumber(int[] arr) {
     //Sort the array
     Arrays.sort(arr);
    //iterate over array and check the difference between adjacent elements
     for(int i = 0; i < arr.length; i ++){
         int difference = arr[i+1] - arr[i];
         if(difference > 1){
             return arr[i]+1;
         }
     }
return 0;   
}