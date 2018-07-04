//Write a method that checks if a given integer is a palindrome - without allocating additional heap space 

public static Boolean isIntPalindrome(int x) {            

    char [] charArr = String.valueOf(x).toCharArray();
    int mid = (charArr.length)/2;
    int len = charArr.length -1;
    for (int i = 0; i < mid; i++) {
        if(charArr[i] == charArr[len]){
            len--;
            continue;
        } else {
            return false;
        }

    }
return true;
}