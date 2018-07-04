// Merge two sorted arrays

public static int[] merge(int[] arrLeft, int[] arrRight){
  
int len = arrRight.length + arrLeft.length - 1;

    int arrleftLen = arrLeft.length - 1;
    int arrRightLen = arrRight.length - 1;
    int [] arr = new int[len + 1];

    int i = 0;
    int j = 0;
    int k = 0;

    while(i <= arrleftLen && j <= arrRightLen){
        if(arrLeft[i] <= arrRight[j]){
            arr[k++] = arrLeft[i++];
        }else{
            arr[k++] = arrRight[j++];
        }
    }

    while(i <= arrleftLen){
        arr[k++] = arrLeft[i++];
    }

    while(j <= arrRightLen){
        arr[k++] = arrRight[j++];
    }

return arr;
}