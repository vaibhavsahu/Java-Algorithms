//Rotate Linear Array 

public static int[] rotateLeft(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - k -1);
        reverse(arr, arr.length - k, arr.length - 1);
        
        return arr;
}

public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
}